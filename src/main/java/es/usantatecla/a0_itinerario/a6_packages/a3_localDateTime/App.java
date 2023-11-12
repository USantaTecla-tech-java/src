package es.usantatecla.a0_itinerario.a6_packages.a3_localDateTime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

class App {

  public static void main(String[] args) {
    trace(LocalDate.of(1, 2, 3));
    trace(LocalDate.of(1, Month.FEBRUARY, 3));
    trace(LocalDate.parse("0001-02-03"));

    trace(LocalTime.of(4, 5, 6));
    trace(LocalTime.of(4, 5));
    trace(LocalTime.parse("04:05:06"));
    trace(LocalTime.parse("04:05"));

    trace(LocalDateTime.parse("0001-02-03T04:05:06"));
    trace(LocalDateTime.parse("0001-02-03T04:05"));
    trace(LocalDateTime.of(LocalDate.parse("0001-02-03"), LocalTime.parse("04:05")));

    LocalDateTime now = LocalDateTime.now();
    trace("now in Paris: " + ZonedDateTime.of(now, ZoneId.of("Europe/Paris")));
    trace("now in Paris: " + ZonedDateTime.parse("0001-02-03T04:05:06+01:00[Europe/Paris]"));

    trace("now: " + now);
    trace("now: " + now.toLocalDate());
    trace("now: " + now.toLocalTime());
    trace("tomorrow: " + now.plusDays(1));
    trace("tomorrow: " + now.plus(Period.ofDays(1)));
    trace("tomorrow: " + now.plus(1, ChronoUnit.DAYS));
    trace("next year: " + now.plusYears(1));
    trace("hour ago: " + now.minusHours(1));
    trace("hour ago: " + now.minus(1, ChronoUnit.HOURS));
    trace("hour ago: " + now.minus(Duration.ofHours(1)));

    LocalDateTime tomorrow = now.plusDays(1);
    trace("horas: " + Duration.between(now, tomorrow).toHours());
    trace("horas: " + ChronoUnit.HOURS.between(now, tomorrow));
    trace("dias: " + Period.between(now.toLocalDate(), tomorrow.toLocalDate()).getDays());
    trace("dias: " + ChronoUnit.DAYS.between(now, tomorrow));

    trace("now-firstDayOfMonth: " + now.with(TemporalAdjusters.firstDayOfMonth()));
    trace("now-lastDayOfYear: " + now.with(TemporalAdjusters.lastDayOfYear()));
    trace("now-getDayOfWeek: " + now.getDayOfWeek());
    trace("now-getDayOfWeek: " + (now.getDayOfWeek().ordinal() + 1));
    trace("now-getDayOfMonth: " + now.getDayOfMonth());
    trace("now is before plus second: " + now.isBefore(now.plusSeconds(1)));
    trace("now is after minus second: " + now.isAfter(now.minusSeconds(1)));

    trace("now isLeapYear " + now.getYear() + "? " + LocalDate.now().isLeapYear());
    trace("2000 isLeapYear " + 2000 + "? " + LocalDate.of(2000, 2, 29).isLeapYear());
    trace("2001 isLeapYear " + 2001 + "? " + LocalDate.of(2001, 2, 28).isLeapYear());

    trace("now: " + now.format(DateTimeFormatter.ofPattern("yyyy/dd/MM")));
    trace("now: " + now.format(DateTimeFormatter.ofPattern("yyyy/MM/dd")));
    trace("now: " + now.format(DateTimeFormatter.ofPattern("yyyy/MM/dd - hh:mm:ss")));
    trace("now: " + now.format(DateTimeFormatter.ofPattern("yyyy/MM/dd - HH:mm")));
    trace("now: " + now.format(DateTimeFormatter.ofPattern("yyyy/MM ")));
  }

  private static void trace(Object object) {
    Console.instance().writeln(object);
  }

}
