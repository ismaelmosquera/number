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
* TestNatural.java
*
* Author: Ismael Mosquera Rivera
*
*/

import number.NaturalNumber;
import number.NumberSetFactory;

/*
* Testing program example to demonstrate the NaturalNumber class.
*
*/
public class TestNatural
{
public static void main(String[] args)
{
NaturalNumber a = NumberSetFactory.natural(2);
NaturalNumber b = NumberSetFactory.natural(3);

System.out.println(a + " + " + b + " = " + a.add(b));
System.out.println(a + " * " + b + " = " + a.mul(b));
System.out.println(a + "^" + b + " = " + a.pow(b));
a.set(a.add(b).get());
System.out.println("factorial(" + a + ") = " + a.factorial());
System.out.println("clone(" + b + ") = " + (NaturalNumber)b.clone());
System.out.println(a + " == " + b + " is " + a.equals(b));
System.out.println(a + " == " + a + " is " + a.equals(a));

System.out.println();
System.out.println("bye.");
}
}

// END
