package es.usantatecla.nestedDocs;

// 1.4.1. Interfaz funcional

// 1.4.1.1. Interfaz Consumidor
// metodo accept

import java.util.function.Consumer; // void accept(T t);

import java.util.function.IntConsumer; // void accept(int value);
import java.util.function.LongConsumer; // void accept(long value);
import java.util.function.DoubleConsumer; // void accept(double value);

import java.util.function.BiConsumer; // void accept(T t, U u);

import java.util.function.ObjIntConsumer; // void accept(T t, int value);
import java.util.function.ObjLongConsumer; // void accept(T t, long value);
import java.util.function.ObjDoubleConsumer; // void accept(T t, double value);	

// 1.4.1.2. Interfaz Función
// metodo apply(p, p?), applyAsLong, applyAsDouble

import java.util.function.Function; // R apply(T t);

import java.util.function.ToIntFunction; // int apply(T t);
import java.util.function.ToLongFunction; // long apply(T t);
import java.util.function.ToDoubleFunction; // double apply(T t);

import java.util.function.IntFunction; // R apply(int value);
import java.util.function.IntToLongFunction; // long applyAsLong(int value);
import java.util.function.IntToDoubleFunction; // double applyAsDouble(int value);

import java.util.function.LongFunction; // R apply(long value);
import java.util.function.LongToIntFunction; // int apply(long value);
import java.util.function.LongToDoubleFunction; // double applyAsDouble(long value);

import java.util.function.DoubleFunction; // R apply(double value);
import java.util.function.DoubleToIntFunction; // int applyAsInt(double value);
import java.util.function.DoubleToLongFunction; // long applyAsLong(double value);

import java.util.function.BiFunction; // R apply(T t, U u);
import java.util.function.ToIntBiFunction; // int applyAsInt(T t, U u);
import java.util.function.ToLongBiFunction; // long applyAsLong(T t, U u);
import java.util.function.ToDoubleBiFunction; // double applyAsDouble(T t, U u);

// 1.4.1.4. Interfaz Operador
// metodo apply(p, p?), applyAsInt, applyAsLong, applyAsDouble

import java.util.function.UnaryOperator; // T apply(T t);

import java.util.function.IntUnaryOperator; // int applyAsInt(int operand);
import java.util.function.LongUnaryOperator; // long applyAsLong(long operand);
import java.util.function.DoubleUnaryOperator; // double applyAsDouble(double operand);

import java.util.function.BinaryOperator; // T apply(T left, T right);

import java.util.function.IntBinaryOperator; // int applyAsInt(int left, int right);
import java.util.function.LongBinaryOperator; // long applyAsLong(long left, long right);
import java.util.function.DoubleBinaryOperator; // double applyAsDouble(double left, double right);

// 1.4.1.3. Interfaz Predicado
// metodo test(p, p?)

import java.util.function.Predicate; // boolean test(T t);

import java.util.function.IntPredicate; // boolean test(int value);	
import java.util.function.LongPredicate; // boolean test(long value);
import java.util.function.DoublePredicate; // boolean test(double value);	

import java.util.function.BiPredicate; // boolean test(T t, U u);	

// 1.4.1.4. Interfaz Suministrador
// metodo get() 

import java.util.function.Supplier; // T get();

import java.util.function.IntSupplier; // int get();
import java.util.function.LongSupplier; // long get();
import java.util.function.DoubleSupplier; // double get();
import java.util.function.BooleanSupplier; // boolean get();




