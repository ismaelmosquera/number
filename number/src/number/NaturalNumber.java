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
* NaturalNumber.java
*
* number-set
*
* Author: Ismael Mosquera Rivera
*
*/

package number;

/**
* The <code>NaturalNumber</code> class implements all what you can do with natural numbers.
* <p>
* N = {1, 2, 3, 4 ... n} [1..+infinity(n)(
	* <p>
* Basic operations supported by a natural number:
* <ul>
* <li>Addition.</li>
* <li>Multiplication.</li>
* </ul>
* <p>
* So that after each supported operation, the resulting value also belongs to N.
* <p>
* Non-basic supported operations:
* <ul>
* <li>Factorial</li>
* <li>Power</li>
* </ul>
* <p>
* factorial(n) where n is an element of N.
* <p>
* n1^n2 where n1, n2 are elements of N.
* <p>
* So, the resulting element is also included in N.
* <p>
* This class uses assertions, so you must be use the '-ea' modifier when executing, in order to enable assertions.
* <p>
* example:
* <p>
* <code>java -ea MyApp</code>
*
*/
public class NaturalNumber implements Number
{

/**
* Constructor.
* <p>
* Makes a new instance for a <code>NaturalNumber</code> object.
* <p>
* The encapsulated natural number is set to 1.
*
*/
public NaturalNumber()
{
	n = 1;
}

/**
* Constructor.
* <p>
* Makes a new instance for a <code>NaturalNumber</code> object.
* <p>
* @param n Natural number.
*
*/
public NaturalNumber(int n)
{
assert (n > 0): "Natural. Constructor: Bad parameter, n must be greater than zero.";
	this.n = n;
}

/**
* Copy constructor.
* <p>
* Makes a new instance for a <code>NaturalNumber</code> object.
* <p>
* @param n A <code>NaturalNumber</code> object.
* <p>
* The encapsulated value takes the value of the parameter.
*
*/
public NaturalNumber(NaturalNumber n)
{
this.n = n.get();
}

/**
* Gets the natural encapsulated in this instance as a 'int'.
* <p>
* @return Encapsulated natural value.
*
*/
public int get()
{
return n;
}

/**
* Sets a natural number to be encapsulated.
* <p>
* @param n Natural number to be encapsulated in this object.
*
*/
public void set(int n)
{
assert (n > 0): "Natural. Method set: Bad parameter, n must be greater than zero.";
this.n = n;
}

/**
* Adds the <code>NaturalNumber</code> passed as parameter to this one.
* <p>
* @param n Natural number to add.
* <p>
* @return Natural number resulting to the addition.
*
*/
public NaturalNumber add(NaturalNumber n)
{
	return add(this, n);
}

/**
* Multiplies the <code>NaturalNumber</code> passed as parameter to this one.
* <p>
* @param n Natural number to multiplied.
* <p>
* @return Natural number resulting to the multiplication.
*
*/
public NaturalNumber mul(NaturalNumber n)
{
return mul(this, n);
}

/**
* Computes the factorial for this <code>NaturalNumber</code> object.
* <p>
* @return factorial of this natural number.
*
*/
public NaturalNumber factorial()
{
return factorial(this);
}

/**
* Computes base^exp.
* <p>
* where base and exp are both natural numbers.
* <p>
* @param exp Power exponent.
* <p>
* base is the encapsulated value and exp is the power.
* <p>
* @return base^exp.
*
*/
public NaturalNumber pow(NaturalNumber exp)
{
	return pow(this, exp);
}

/**
* Static method to add two natural numbers.
* <p>
* @param a A <code>NaturalNumber</code> object.
* @param b A <code>NaturalNumber</code> object.
* <p>
* @return a + b.
*
*/
public static NaturalNumber add(NaturalNumber a, NaturalNumber b)
{
	return new NaturalNumber(a.get() + b.get());
}

/**
* Static method to multiply two natural numbers.
* <p>
* @param a A <code>NaturalNumber</code> object.
* @param b A <code>NaturalNumber</code> object.
* <p>
* @return a * b.
*
*/
public static NaturalNumber mul(NaturalNumber a, NaturalNumber b)
{
return new NaturalNumber(a.get() * b.get());
}

/**
* Static method to compute the factorial of a natural number.
* <p>
* @param n A <code>NaturalNumber</code> object.
* <p>
* @return the factorial of n.
*
*/
public static NaturalNumber factorial(NaturalNumber n)
{
return new NaturalNumber(HelperFunctions.factorial(n.get()));
}

/**
* Static method to compute base^exp.
* <p>
* @param base A <code>NaturalNumber</code> object.
* @param exp A <code>NaturalNumber</code> object.
* <p>
* @return base^exp.
*
*/
public static NaturalNumber pow(NaturalNumber base, NaturalNumber exp)
{
	return new NaturalNumber(HelperFunctions.pow(base.get(), exp.get()));
}

/**
* Makes a clone of this object.
* <p>
* You must cast to get the concrete object class.
* <p>
* example:
* NaturalNumber n1 = (NaturalNumber)n0.clone();
* <p>
* @return A clone of this object.
*
*/
public Object clone()
{
return new NaturalNumber(this.n);
}

/**
* Evaluates for equality.
* <p>
* @param obj A <code>NaturalNumber</code> object.
* <p>
* @return true if the encapsulated values of this object and the param are equal or false otherwise.
*
*/
public boolean equals(Object obj)
{
NaturalNumber n = (NaturalNumber)obj;
return (this.n == n.get());
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
return str + this.n;
}


		private int n;
}

// END
