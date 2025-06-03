/*
 * Copyright (c) 2025 Ismael Mosquera Rivera
 *
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 */

/*
* TestReal.java
*
* Author: Ismael Mosquera Rivera
*
*/

import number.IntegerNumber;
import number.NaturalNumber;
import number.RealNumber;
import number.NumberSetFactory;

/*
* This example demonstrates the RealNumber class.
*
*/
public class TestReal
{
public static void main(String[] args)
{
RealNumber r1 = NumberSetFactory.real(6.0);
RealNumber r2 = NumberSetFactory.real(3.0);

System.out.println("FUNDAMENTAL CONSTANTS:");
System.out.println("e = " + RealNumber.e);
System.out.println("pi = " + RealNumber.pi);
System.out.println();

System.out.println("BASIC OPERATIONS:");
System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
System.out.println(r1 + " - " + r2 + " = " + r1.sub(r2));
System.out.println(r1 + " * " + r2 + " = " + r1.mul(r2));
System.out.println(r1 + " / " + r2 + " = " + r1.div(r2));
System.out.println();

System.out.println("GENERAL PURPOSE METHODS:");
r1.set(32.75);
System.out.println("integer part (" + r1 + ") = " + r1.intPart());
System.out.println("decimal part (" + r1 + ") = " + r1.decPart());
r1.set(-12.57);
System.out.println("abs(" + r1 + ") = " + r1.abs());
System.out.println("fmod(3*pi, 2*pi) = " + RealNumber.fmod(new RealNumber(3.0*RealNumber.pi), new RealNumber(2.0*RealNumber.pi)));
System.out.println("sign(" + r1 + ") = " + r1.sign());
System.out.println("neg(" + r1 + ") = " + r1.neg());
r1.set(2.6);
System.out.println("ceil(" + r1 + ") = " + r1.ceil());
System.out.println("floor(" + r1 + ") = " + r1.floor());
System.out.println("round(" + r1 + ") = " + r1.round());
r1.set(6.0);
System.out.println("max(" + r1 + ", " + r2 + ") = " + r1.max(r2));
System.out.println("min(" + r1 + ", " + r2 + ") = " + r1.min(r2));
r1.set(3.0);
r2.set(4.0);
System.out.println("square(" + r1 + ") = " + r1.square());
System.out.printf("hypot(3, 4) = %.1f\r\n", RealNumber.hypot(r1, r2).get());
System.out.println("factorial(120) = " + RealNumber.factorial(new IntegerNumber(120)));
System.out.println();

System.out.println("ANALITIC METHODS:");
r1.set(2.0);
r2.set(6.0);
System.out.printf("2^6 = %.1f\r\n", r1.pow(r2).get());
r1.set(-2.0);
r2.set(-2.0);
System.out.printf("-2^-2 = %.2f\r\n", r1.pow(r2).get());
r1.set(0.0);
System.out.println("exp(" + r1 + ") = " + r1.exp());
r1.set(1.0);
System.out.println("exp(" + r1 + ") = " + r1.exp());
System.out.printf("log(1) = %.1f\r\n", r1.log().get());
r1.set(RealNumber.e);
System.out.printf("log(e) = %.1f\r\n", r1.log().get());
r1.set(1024.0);
System.out.printf("log2(1024) = %.1f\r\n", r1.log2().get());
r1.set(1000000.0);
System.out.printf("log10(1000000) = %.1f\r\n", r1.log10().get());
r1.set(1.0/1000.0);
System.out.printf("log10(1/1000) = %.1f\r\n", r1.log10().get());
r1.set(2.0);
System.out.println("sqrt(" + r1 + ") = " + r1.sqrt());
r1.set(125.0);
System.out.printf("curt(125) = %.1f\r\n", r1.curt().get());
r1.set(2.0);
NaturalNumber n = NumberSetFactory.natural(12);
System.out.println(n + "th root of " + r1 + " = " + r1.ithrt(n));
System.out.println();

System.out.println("TRIGONOMETRIC METHODS:");
r1.set(3.0/4.0*RealNumber.pi);
r2 = r1.sin();
System.out.println("sin(3.0/4.0*pi) = " + r2);
System.out.printf("asin(%f) = %f radians, = %.2f degrees.\r\n", r2.get(), r2.asin().get(), r2.asin().toDegrees().get());
r1.set(RealNumber.pi/8.0);
r2 = r1.cos();
System.out.println("cos(pi/8.0) = " + r2);
System.out.printf("acos(%f) = %f radians, = %.2f degrees.\r\n", r2.get(), r2.acos().get(), r2.acos().toDegrees().get());
r1.set(3.0/4.0*RealNumber.pi);
r2 = r1.tan();
System.out.printf("tan(3/4*pi) = %.1f\r\n", r2.get());
System.out.printf("atan(%.1f) = %f radians, %.2f degrees.\r\n", r2.get(), r2.atan().get(), r2.atan().toDegrees().get());
r1.set(4.0);
r2.set(3.0);
System.out.printf("atan2(4, 3) = %f radians, %.2f degrees.\r\n", RealNumber.atan2(r1, r2).get(), RealNumber.atan2(r1, r2).toDegrees().get());
System.out.println();

System.out.println("HYPERBOLIC METHODS:");
r1.set(1.0/4.0);
System.out.println("cosh(1/4) = " + r1.cosh());
r1.set(3.0/2.0);
System.out.println("sinh(3/2) = " + r1.sinh());
r1.set(4.0/3.0);
r2 = r1.tanh();
System.out.println("tanh(4/3) = " + r2);
System.out.printf("atanh(%f) = %f\r\n", r2.get(), r2.atanh().get());

System.out.println();
System.out.println("bye.");
}
}

// END
