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
* IntegerNumber.java
*
* number-set
*
* Author: Ismael Mosquera Rivera
*/

package number;

/**
 * The <code>IntegerNumber</code> class implements all what you can do with integer numbers.
 * <p>
 * Z = {-n ... -2, -1, 0, 1, 2 ... n} )-infinity(z)..+infinity(z)(
	 * <p>
 * Basic operations supported by an integer number:
 * <ul>
 * <li>Addition.</li>
 * <li>Substraction.</li>
 * <li>Multiplication.</li>
 * </ul>
 * <p>
 * So that after each supported operation, the resulting value also belongs to Z.
 * <p>
 * Non-basic supported operations:
  * <ul>
  * <li>Abs ( absolute value ).</li>
  * <li>Factorial.</li>
  * <li>Power.</li>
  * </ul>
 * <p>
 * Since the resulting value after applying any of the above operations, is also an element of Z.
 * <p>
 * Notice that Z is a superset of N. so, N included in Z.
 * <p>
 * @author Ismael Mosquera Rivera
 */
public class IntegerNumber implements Number
{

/**
* Constructor.
* <p>
* Makes a new instance for a <code>IntegerNumber</code> object.
* <p>
* The encapsulated 'int' value is set to zero.
*
*/
public IntegerNumber()
{
z = 0;
}

/**
* Constructor.
* <p>
* Makes a new instance for a <code>IntegerNumber</code> object.
* <p>
* @param z Integer number.
*
*/
public IntegerNumber(int z)
{
	this.z = z;
}

/**
* Copy constructor.
* <p>
* Makes a new instance for a <code>IntegerNumber</code> object.
* <p>
* @param z A <code>IntegerNumber</code> object.
* <p>
* The encapsulated value of the new object takes the value of the parameter.
*
*/
public IntegerNumber(IntegerNumber z)
{
this.z = z.get();
}

/**
* Copy constructor.
* <p>
* Makes a new instance for a <code>IntegerNumber</code> object.
* <p>
* @param n A <code>Natural</code> object.
* <p>
* Since Z is a superset of N, thus N included in Z.
*
*/
public IntegerNumber(NaturalNumber n)
{
this.z = n.get();
}

/**
* Gets the encapsulated 'int' value in this <code>IntegerNumber</code> object.
* <p>
* @return The 'int' value encapsulated by this <code>IntegerNumber</code> instance.
*
*/
public int get()
{
return z;
}

/**
* Sets the <code>IntegerNumber</code> 'int' value for this object.
* <p>
* @param z Integer to be set.
*
*/
public void set(int z)
{
this.z = z;
}

/**
* Adds the integer passed as parameter to this one.
* <p>
* @param z  Integer number to add.
* <p>
* @return this plus z.
*
*/
public IntegerNumber add(IntegerNumber z)
{
	return add(this, z);
}

/**
* Substracts the integer passed as parameter to this one.
* <p>
* @param z  Integer number to substract.
* <p>
* @return this minus z.
*
*/
public IntegerNumber sub(IntegerNumber z)
{
	return sub(this, z);
}

/**
* Multiplies the integer passed as parameter to this one.
* <p>
* @param z  Integer number to multiply.
* <p>
* @return this times z.
*
*/
public IntegerNumber mul(IntegerNumber z)
{
	return mul(this, z);
}

/**
* Adds a natural number to this integer.
* <p>
* @param n A <code>NaturalNumber</code> object.
* <p>
* Take in account that N included in Z.
* <p>
* @return this + n.
*
*/
public IntegerNumber add(NaturalNumber n)
{
return new IntegerNumber(this.z + n.get());
}

/**
* Substracts a natural number from this integer.
* <p>
* @param n A <code>NaturalNumber</code> object.
* <p>
* Take in account that N included in Z.
* <p>
* @return this - n.
*
*/
public IntegerNumber sub(NaturalNumber n)
{
return new IntegerNumber(this.z - n.get());
}

/**
* Multiplies a natural number by this integer.
* <p>
* @param n A <code>NaturalNumber</code> object.
* <p>
* Take in account that N included in Z.
* <p>
* @return this * n.
*
*/
public IntegerNumber mul(NaturalNumber n)
{
return new IntegerNumber(this.z * n.get());
}

/**
* Computes the factorial for this <code>IntegerNumber</code> object.
* <p>
* @return factorial value.
*
*/
public IntegerNumber factorial()
{
return factorial(this);
}

/**
* Computes base^exp.
<p>
* @param exp A <code>NaturalNumber</code> object.
* <p>
* where base is the incapsulated value in this object, and exp is the exponent of the power.
* <p>
* z^0 is excluded because a division  ( not supported ) is involved in the operation.
* <p>
* since:
* <p>
* z^n = z * z^(n-1)
* <p>
* So, z^0 = z * z^-1 = z * 1/z
* <p>
* @return z^exp.
*
*/
public IntegerNumber pow(NaturalNumber exp)
{
return pow(this, exp);
}

/**
* Computes the absolute value of this integer number.
* <p>
* @return absolute value of this integer.
*
*/
public IntegerNumber abs()
{
	return abs(this);
}

/**
* Static method to add two integers.
* <p>
* @param a A <code>IntegerNumber</code> object.
* @param b A <code>IntegerNumber</code> object.
* <p>
* @return a+b.
*
*/
public static IntegerNumber add(IntegerNumber a, IntegerNumber b)
{
return new IntegerNumber(a.get() + b.get());
}

/**
* Static method to substract two integers.
* <p>
* @param a A <code>IntegerNumber</code> object.
* @param b A <code>IntegerNumber</code> object.
* <p>
* @return a-b.
*
*/
public static IntegerNumber sub(IntegerNumber a, IntegerNumber b)
{
return new IntegerNumber(a.get() - b.get());
}

/**
* Static method to multiply two integers.
* <p>
* @param a A <code>IntegerNumber</code> object.
* @param b A <code>IntegerNumber</code> object.
* <p>
* @return a*b.
*
*/
public static IntegerNumber mul(IntegerNumber a, IntegerNumber b)
{
return new IntegerNumber(a.get() * b.get());
}

/**
* Static method to compute the factorial of an integer.
* <p>
* @param z A <code>IntegerNumber</code> object.
* <p>
* @return factorial of the parameter.
*
*/
public static IntegerNumber factorial(IntegerNumber z)
{
	return new IntegerNumber(HelperFunctions.factorial(z.get()));
}

/**
* Static method to compute base^exp for an integer.
* <p>
* @param base A <code>IntegerNumber</code> object.
* @param exp A <code>NaturalNumber</code> object.
* <p>
* @return base^exp.
*
*/
public static IntegerNumber pow(IntegerNumber base, NaturalNumber exp)
{
return new IntegerNumber(HelperFunctions.pow(base.get(), exp.get()));
}

/**
* Static method to compute the absolute value of this integer number.
* <p>
* @param z A <code>IntegerNumber</code> object.
* <p>
* @return absolute value of the parameter z.
*
*/
public static IntegerNumber abs(IntegerNumber z)
{
return new IntegerNumber(HelperFunctions.abs(z.get()));
}

/**
* Makes a clone of this object.
* <p>
* Take in account that you must cast to get the concrete object.
* <p>
* example:
* <p>
* Integer z1 = (Integer)z.clone();
* <p>
* @return A clone of this object.
*
*/
public Object clone()
{
	return new IntegerNumber(this.z);
}

/**
* Evaluates for equality.
* <p>
* @param obj A <code>Integer</code> object.
* <p>
* @return true if the encapsulated values of this object and the param are equal or false otherwise.
*
*/
public boolean equals(Object obj)
{
IntegerNumber z = (IntegerNumber)obj;
return (this.z == z.get());
}

/**
* Gets a <code>String</code> representation of the value encapsulated by this object.
* <p>
* @return A String representation for this object.
*
*/
public String toString()
{
String str = "";
return str + this.z;
}


private int z;
}

// END
