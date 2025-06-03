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
* TestInteger.java
*
* Author: Ismael Mosquera Rivera
*
*/

import number.IntegerNumber;
import number.NaturalNumber;
import number.NumberSetFactory;

/*
* This example demonstrates the IntegerNumber class.
*
*/
public class TestInteger
{
public static void main(String[] args)
{
IntegerNumber z1 = NumberSetFactory.integer(5);
IntegerNumber z2 = NumberSetFactory.integer(7);

System.out.println(z1 + " + " + z2 + " = " + z1.add(z2));
System.out.println(z1 + " - " + z2 + " = " + z1.sub(z2));
System.out.println(z1 + " * " + z2 + " = " + z1.mul(z2));

System.out.println("factorial(" + z2 + ") = " + z2.factorial());
NaturalNumber n = NumberSetFactory.natural(3);
System.out.println(z1 + "^" + n + " = " + z1.pow(n));
z1.set(-13);
System.out.println("abs(" + z1 + ") = " + z1.abs());
System.out.println("clone(" + z1 + ") = " + (IntegerNumber)z1.clone());
System.out.println(z1 + " == " + z2 + " is " + z1.equals(z2));
System.out.println(z2 + " == " + z2 + " is " + z2.equals(z2));
System.out.println();
System.out.println("bye.");
}
}

// END
