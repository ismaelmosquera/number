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
* TestRational.java
*
* Author: Ismael Mosquera Rivera
*
*/

import number.IntegerNumber;
import number.RationalNumber;
import number.NumberSetFactory;

/*
* This example demonstrates the RationalNumber class.
*
*/
public class TestRational
{
public static void main(String[] args)
{
RationalNumber q1 = NumberSetFactory.rational(3, 4);
RationalNumber q2 = NumberSetFactory.rational(1, 2);

System.out.println(q1 + " + " + q2 + " = " + q1.add(q2) + " = " + q1.add(q2).reduce());
System.out.println(q1 + " - " + q2 + " = " + q1.sub(q2) + " = " + q1.sub(q2).reduce());
System.out.println(q1 + " * " + q2 + " = " + q1.mul(q2));
System.out.println(q1 + " / " + q2 + " = " + q1.div(q2) + " = " + q1.div(q2).reduce());

q2.set(-4, 3);
System.out.println("abs(" + q2 + ") = " + q2.abs());
IntegerNumber z = NumberSetFactory.integer(0);
System.out.println(q1 + "^" + z + " = " + q1.pow(z));
z.set(2);
q1.setDenominator(6);
System.out.println(q1 + "^" + z + " = " + q1.pow(z) + " = " + q1.pow(z).reduce());
System.out.println("clone(" + q1 + ") = " + (RationalNumber)q1.clone());
System.out.println(q1 + " == " + q2 + " is " + q1.equals(q2));
System.out.println(q1 + " == " + q1 + " is " + q1.equals(q1));
System.out.println();
System.out.println("bye.");
}
}

// END
