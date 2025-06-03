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
* TestComplex.java
*
* Author: Ismael Mosquera Rivera
*
*/

import number.ComplexNumber;
import number.NumberSetFactory;

/*
* This example demonstrates the ComplexNumber class.
*
*/
public class TestComplex
{
public static void main(String[] args)
{
ComplexNumber c1 = NumberSetFactory.complex(2.0, 3.0);
ComplexNumber c2 = NumberSetFactory.complex(-4.0, 5.0);

System.out.println("BASIC OPERATIONS:");
System.out.println(c1 + " + " + c2 + " = " + c1.add(c2));
System.out.println(c1 + " - " + c2 + " = " + c1.sub(c2));
System.out.println(c1 + " * " + c2 + " = " + c1.mul(c2));
System.out.println(c1 + " / " + c2 + " = " + c1.div(c2));
System.out.println();
System.out.println("GENERAL PURPOSE METHODS:");
double f = 0.5;
System.out.println("scale" + c1 + ", " + f + ") = " + c1.scale(f));
System.out.println("conjugated" + c1 + " = " + c1.conjugated());
System.out.println("reciprocal" + c1 + " = " + c1.reciprocal());
System.out.println(c1 + " * " + " reciprocal" + c1 + " = " + c1.mul(c1.reciprocal()));
c1.set(3.0, 4.0);
System.out.printf("mag(3, 4i) = %.1f\r\n", c1.mag().get());
System.out.println("arg" + c1 + " = " + c1.arg());
System.out.println();
System.out.println("TRIGONOMETRIC AND EXPONENTIAL METHOD:");
System.out.println("sin" + c1 + " = " + c1.sin());
System.out.println("cos" + c1 + " = " + c1.cos());
System.out.println("tan" + c1 + " = " + c1.tan());
System.out.println("exp" + c1 + " = " + c1.exp());
System.out.println();
System.out.println("bye.");
}
}

// END
