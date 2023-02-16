package es.usantatecla.a5_units.a1_interval.a1_classes.a1_attributes.a00_mutable;

class Interval {

  private double min;
  private double max;

  public Interval(double min, double max) {
      this.min = min;
      this.max = max;
  }

  public Interval(double max) {
      this(0, max);
  }

  public Interval() {
      this(0);
  }

  public Interval clone() {
      return new Interval(this);
  }

  public Interval(Interval interval) {
      this(interval.min, interval.max);
  }

  public double getMin() {
      return this.min;
  }

  public void setMin(double min){
      this.min = min;
  }

  public double getMax() {
      return this.max;
  }

  public void setMax(double max){
      this.max = max;
  }

  public double length() {
      return this.max - this.min;
  }

  public void setLength(double length) {
      double middlePoint = this.middlePoint();
      this.setMin(middlePoint - length / 2);
      this.setMax(middlePoint + length / 2);
  }
  
  // public double middlePoint() {
  //     return (this.min + this.max) / 2;
  // }

  public double middlePoint() {
      return this.min + this.length() / 2;
  }

  public void setMiddlePoint(double middlePoint) {
      double length = this.length();
      this.setMin(middlePoint - length / 2);
      this.setMax(middlePoint + length / 2);
  }

  public void scale(double scale) {
      double newMiddelPoint = this.middlePoint();
      double newHalfLength = this.length() * scale / 2;
      this.min = newMiddelPoint - newHalfLength;
      this.max = newMiddelPoint + newHalfLength;
  }

  public Interval scaled(double scale) {
      Interval scaled = this.clone();
      scaled.scale(scale);
      return scaled;
  }

  public Interval opposite() {
      return new Interval(-this.max, -this.min);
  }

  public boolean includes(double point) {
      return this.min <= point && point <= this.max;
  }

  public boolean includes(Interval interval) {
      assert this != null;

      return this.includes(interval.min)
              && this.includes(interval.max);
  }

  public boolean isIntersected(Interval interval) {
      assert this != null;

      return this.includes(interval.min)
              || this.includes(interval.max)
              || interval.includes(this);
  }

  // public Interval intersection(Interval interval) {
  // assert this.isIntersected(intervalo);
  // Interval intersection = this.clone();
  // if (interval.min > this.min) {
  // intersection.min = interval.min;
  // }
  // if (interval.max < this.max) {
  // intersection.max = interval.max;
  // }
  // return intersection;
  // }

  public Interval intersection(Interval intervalo) {
      assert this.isIntersected(intervalo);

      if (this.includes(intervalo)) {
          return intervalo.clone();
      }
      if (intervalo.includes(this)) {
          return this.clone();
      }
      if (this.includes(intervalo.min)) {
          return new Interval(intervalo.min, this.max);
      }
      return new Interval(this.min, intervalo.max);
  }

  // public Interval union(Interval interval) {
  //     assert this.isIntersected(intervalo);

  //     Interval union = this.clone();
  //     if (interval.min < this.min) {
  //         union.min = interval.min;
  //     }
  //     if (interval.max > this.max) {
  //         union.max = interval.max;
  //     }
  //     return union;
  // }

  public Interval union(Interval intervalo) {
      assert this.isIntersected(intervalo);

      if (this.includes(intervalo)) {
          return this.clone();
      }
      if (intervalo.includes(this)) {
          return intervalo.clone();
      }
      if (this.includes(intervalo.min)) {
          return new Interval(this.min, intervalo.max);
      }
      return new Interval(intervalo.min, this.max);
  }

  public Interval shifted(double shiftment) {
      return new Interval(this.min + shiftment, this.max + shiftment);
  }

  public void shift(double shiftment) {
      this.min += shiftment;
      this.max += shiftment;
  }

  // public Interval[] split(int times) {
  //     assert times > 0;

  //     Interval[] intervals = new Interval[times];
  //     final double length = this.length() / times;
  //     double origin = this.min;
  //     for (int i = 0; i < intervals.length; i++) {
  //         intervals[i] = new Interval(origin, origin + length);
  //         origin += length;
  //     }
  //     return intervals;
  // }

  public Interval[] split(int times) {
      assert times > 0;
      
      Interval[] intervals = new Interval[times];
      final double length = this.length() / times;
      intervals[0] = new Interval(this.min, this.min + length);
      for (int i = 1; i < intervals.length; i++) {
          intervals[i] = intervals[i-1].shifted(length);
      }
      return intervals;
  }

  public void read() {
      Console console = new Console();
      boolean error;
      do {
          this.min = console.readDouble("Dame el mínimo del intervalo: ");
          this.max = console.readDouble("Dame el máximo del intervalo: ");
          error = !this.isValid();
          if (error) {
              console.writeln("El minimo no puede ser mayor que el maximo");
          }
      } while (error);
  }

  private boolean isValid(){
      return this.min <= this.max;
  }

  public void writeln() {
      new Console().writeln(this.toString());
  }

  public String toString() {
      return "[" + this.min + ", " + this.max + "]";
  }

}
