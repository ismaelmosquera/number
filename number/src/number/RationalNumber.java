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
* RationalNumber.java
*
* number-set
*
* Author: Ismael Mosquera Rivera
*/

package number;


/**
* The <code>RationalNumber</code> class allows you to make operations with rational numbers.
* <p>
* A rational is a fraction q = a/b, where a and b are integer numbers.
* <p>
* Q = {-qn ... -q2, -q1, 0, q1, q2 ... qn} )-infinity(q)..+infinity(q)(
* <p>
* Basic supported operations:
* <ul>
* <li>Addition</li>
* <li>Substraction</li>
* <li>Multiplication</li>
* <li>Division</li>
* </ul>
* <p>
* Non-basic supported operations:
* <ul>
* <li>Abs ( absolute value ).</li>
* <li>Power.</li>
* </ul>
* <p>
* The rational number set is represented by the letter Q.
* <p>
* We have:
* <p>
* Q is a superset of Z.
* <p>
* Since Z is a superset of N, thus N included in Z and Z included in Q  N is also included in Q.
* <p>
* This class uses assertions. so, you must use the '-ea' modifier in order to enable assertions.
* <p>
* example:
* <p>
* <code>java -ea MyApp</code>
* <p>
* @author Ismael Mosquera Rivera
*
*/
public class RationalNumber implements Number
{

	/**
* Constructor.
* <p>
* Makes a new instance for a <code>RationalNumber</code> object.
*
*/
public RationalNumber()
{
this.numerator=0;
this.denominator=1;
}

/**
* Constructor.
* Makes a new instance of a <code>RationalNumber</code> object.
* <p>
* @param numerator int value for the numerator.
* @param denominator int value for the denominator.
*
*/
public RationalNumber(int numerator,int denominator)
{
this.numerator=numerator;
this.denominator=denominator;
}

/**
* Copy constructor.
* <p>
* @param q A <code>RationalNumber</code> object.
*
*/
public RationalNumber(RationalNumber q)
{
this.numerator = q.getNumerator();
this.denominator = q.getDenominator();
}

/**
* Constructor.
* <p>
* makes a new instance for a <code>RationalNumber</code> object from a <code>IntegerNumber</code> object.
* <p>
* @param z A <code>IntegerNumber</code> object.
* <p>
* Take in account that Z is included in Q.
*
*/
public RationalNumber(IntegerNumber z)
{
this(z.get(), 1);
}

/**
* Constructor.
* <p>
* makes a new instance for a <code>RationalNumber</code> object from a <code>NaturalNumber</code> object.
* <p>
* @param n A <code>NaturalNumber</code> object.
* <p>
* Take in account that N is included in Q.
*
*/
public RationalNumber(NaturalNumber n)
{
this(n.get(), 1);
}

/**
* Gets the numerator of this rational number.
* <p>
* @return numerator of this fracction.
*
*/
public int getNumerator()
{
return this.numerator;
}

/**
* Gets the denominator of this rational number.
* <p>
* @return denominator of this fracction.
*
*/
public int getDenominator()
{
return this.denominator;
}

/**
* Sets numerator and denominator values for this rational number.
* <p>
* @param numerator Numerator value.
* @param denominator Denominator value.
*
*/
public void set(int numerator,int denominator)
{
this.numerator=numerator;
this.denominator=denominator;
}

/**
* Sets the numerator for this rational number.
* <p>
* @param numerator Numerator value.
*
*/
public void setNumerator(int numerator)
{
this.numerator=numerator;
}

/**
* Sets the denominator for this rational number.
* <p>
* @param denominator Denominator value.
*
*/
public void setDenominator(int denominator)
{
this.denominator=denominator;
}

/**
* Evaluates for proper or improper fraction.
* <p>
* @return true if the fracction is proper or false otherwise.
*
*/
public boolean isProper()
{
	return isProper(this);
}

/**
* Adds the rational passed as parameter to this one.
* <p>
* @param q Rational number to add.
* <p>
* @return this plus q.
*
*/
public RationalNumber add(RationalNumber q)
{
return add(this, q);
}

/**
* Substracts the rational passed as parameter to this one.
* <p>
* @param q Rational number to substract.
* <p>
* @return this minus q.
*
*/
public RationalNumber sub(RationalNumber q)
{
	return sub(this, q);
}

/**
* Multiplies the rational passed as parameter by this one.
* <p>
* @param q Rational number to multiply.
* <p>
* @return this times q.
*
*/
public RationalNumber mul(RationalNumber q)
{
return mul(this, q);
}

/**
* Divides this rational by the rational passed as parameter.
* <p>
* @param q Rational number to divide.
* <p>
* @return this divided by q.
*
*/
public RationalNumber div(RationalNumber q)
{
	return div(this, q);
}

/**
* Adds the integer passed as parameter to this rational.
* <p>
* @param z Integer number to add.
* <p>
* @return this plus z.
*
*/
public RationalNumber add(IntegerNumber z)
{
return add(this, new RationalNumber(z.get(), 1));
}

/**
* Substracts the integer passed as parameter to this rational.
* <p>
* @param z Integer number to substract.
* <p>
* @return this minus z.
*
*/
public RationalNumber sub(IntegerNumber z)
{
return sub(this, new RationalNumber(z.get(), 1));
}

/**
* Multiplies this rational by the integer passed as parameter.
* <p>
* @param z Integer number to multiply.
* <p>
* @return this times z.
*
*/
public RationalNumber mul(IntegerNumber z)
{
return mul(this, new RationalNumber(z.get(), 1));
}

/**
* Divides  this rational by the integer passed as parameter.
* <p>
* @param z Integer number to divide.
* <p>
* @return this divided by z.
*
*/
public RationalNumber div(IntegerNumber z)
{
return div(this, new RationalNumber(z.get(), 1));
}

/**
* Adds the natural passed as parameter to this rational.
* <p>
* @param n Natural number to add.
* <p>
* @return this plus n.
*
*/
public RationalNumber add(NaturalNumber n)
{
return add(this, new RationalNumber(n.get(), 1));
}

/**
* Substracts the natural passed as parameter from this rational.
* <p>
* @param n Natural number to substract.
* <p>
* @return this minus n.
*
*/
public RationalNumber sub(NaturalNumber n)
{
	return sub(this, new RationalNumber(n.get(), 1));
}

/**
* Multiplies the natural passed as parameter by this rational.
* <p>
* @param n Natural number to multiply.
* <p>
* @return this times n.
*
*/
public RationalNumber mul(NaturalNumber n)
{
return mul(this, new RationalNumber(n.get(), 1));
}

/**
* Divides this rational by the integer passed as parameter.
* <p>
* @param n Natural number to divide.
* <p>
* @return this divided by n.
*
*/
public RationalNumber div(NaturalNumber n)
{
return div(this, new RationalNumber(n.get(), 1));
}

/**
* Reduces this rational number if posible.
* <p>
* @return Reduced fracction of this rational number.
*
*/
public RationalNumber reduce()
{
	return reduce(this);
}

/**
* Gets the absolute ( numerator and denominator ) values of this rational number.
* <p>
* @return absolute fracction value of this rational number.
*
*/
public RationalNumber abs()
{
	return abs(this);
}

/**
* Computes the power of this rational number respect to an integer exponent.
* <p>
* @param exp A <code>IntegerNumber</code> object.
* <p>
* @return this^z.
*
*/
public RationalNumber pow(IntegerNumber exp)
{
return pow(this, exp);
}

/**
* Makes a clone of this object.
* <p>
* You must cast the return object to <code>RationalNumber</code> in order to get the correct result.
* <p>
* Example:
* <code>RationalNumber q1 = (RationalNumber)q.clone();</code>
* <p>
* @return A clone of this rational number.
*
*/
public Object clone()
{
return new RationalNumber(this.numerator, this.denominator);
}

/**
* Evaluates for equality.
* <p>
* @param obj A  <code>RationalNumber</code> object to compare.
* <p>
* @return true if this rational is equal than the one passed as parameter, or false otherwise.
*
*/
public boolean equals(Object obj)
{
	RationalNumber q = (RationalNumber)obj;
return (this.numerator*q.getDenominator())==(this.denominator*q.getNumerator());
}

/**
* Gets a string representation of this rational number.
* <p>
* @return String representation of this rational.
*
*/
public String toString()
{
String s="";
s+=this.numerator+"/"+this.denominator;
return s;
}

/**
* Static method to add two rational numbers.
* <p>
* @param q1 A <code>RationalNumber</code> object.
* @param q2 A <code>RationalNumber</code> object.
* <p>
* @return q1 + q2.
*
*/
public static RationalNumber add(RationalNumber q1,RationalNumber q2)
{
	assert (q1.isValid() && q2.isValid()): "RationalNumber -> method add: denominator must be != 0";
int _numerator;
int _denominator;
_denominator = q1.getDenominator()*q2.getDenominator();
_numerator=(_denominator/q1.getDenominator()*q1.getNumerator())+(_denominator/q2.getDenominator()*q2.getNumerator());
return new RationalNumber(_numerator,_denominator);
}

/**
* Static method to substract two rational numbers.
* <p>
* @param q1 A <code>RationalNumber</code> object.
* @param q2 A <code>RationalNumber</code> object.
* <p>
* @return q1 - q2.
*
*/
public static RationalNumber sub(RationalNumber q1,RationalNumber q2)
{
	assert (q1.isValid() && q2.isValid()): "RationalNumber -> method sub: denominator must be != 0";
int _numerator;
int _denominator;
_denominator = q1.getDenominator()*q2.getDenominator();
_numerator=(_denominator/q1.getDenominator()*q1.getNumerator())-(_denominator/q2.getDenominator()*q2.getNumerator());
return new RationalNumber(_numerator,_denominator);
}

/**
* Static method to multiply two rational numbers.
* <p>
* @param q1 A <code>RationalNumber</code> object.
* @param q2 A <code>RationalNumber</code> object.
* <p>
* @return q1 * q2.
*
*/
public static RationalNumber mul(RationalNumber q1,RationalNumber q2)
{
assert (q1.isValid() && q2.isValid()): "RationalNumber -> method mul: denominator must be != 0";
return new RationalNumber(q1.getNumerator()*q2.getNumerator(),q1.getDenominator()*q2.getDenominator());
}

/**
* Static method to divide two rational numbers.
* <p>
* @param q1 A <code>RationalNumber</code> object.
* @param q2 A <code>RationalNumber</code> object.
* <p>
* @return q1 / q2.
*
*/
public static RationalNumber div(RationalNumber q1,RationalNumber q2)
{
	assert (q1.isValid() && q2.isValid()): "RationalNumber -> method div: denominator must be != 0";
return new RationalNumber(q1.getNumerator()*q2.getDenominator(), q1.getDenominator()*q2.getNumerator());
}

/**
* Static method to reduce a fracction.
* <p>
* @param q A <code>RationalNumber</code> object.
* <p>
* @return Reduced fracction.
*
*/
public static RationalNumber reduce(RationalNumber q)
{
int d = gcd(q.getNumerator(), q.getDenominator());
return new RationalNumber(q.getNumerator()/d, q.getDenominator()/d);
}

/**
* Static method to get the absolute fracction value of this rational number.
* <p>
* @param q A <code>RationalNumber</code> object.
* <p>
* @return Absolute fracction value.
*
*/
public static RationalNumber abs(RationalNumber q)
{
return new RationalNumber(HelperFunctions.abs(q.getNumerator()), HelperFunctions.abs(q.getDenominator()));
}

/**
* Computes Q^Z for this rational number.
* <p>
* @param q A <code>RationalNumber</code> object.
* @param exp A <code>IntegerNumber</code> object.
* <p>
* @return q^z.
*
*/
public static RationalNumber pow(RationalNumber q, IntegerNumber exp)
{
	int z = exp.get();
assert (z >= 0): "RationalNumber -> method pow: exponent must be >= 0";
return new RationalNumber(HelperFunctions.pow(q.getNumerator(), exp.get()), HelperFunctions.pow(q.getDenominator(), exp.get()));
}

/**
* Evaluates for proper or improper fracction.
* <p>
* @param q A <code>RationalNumber</code> object.
* <p>
* @return true if proper or false otherwise.
*
*/
public static boolean isProper(RationalNumber q)
{
	return (HelperFunctions.abs(q.getNumerator()) <= HelperFunctions.abs(q.getDenominator()));
}


/*
* Method to compute the greatest common divisor of two integers.
* Iterative implementation by: Ismael Mosquera rivera.
*/
private static int gcd(int n1, int n2)
{
int d;
int r;
int a = HelperFunctions.abs(n1);
int b = HelperFunctions.abs(n2);

if(a < b)
{
	int tmp = a;
	a = b;
	b = tmp;
}
if(b == 0) return a;
while(true)
{
	if((a%b)==0)
	{
	d = b;
	break;
	}
	r = a%b;
	a = b;
	b = r;
}
return d;
}

private boolean isValid()
{
return this.denominator!=0;
}


private int numerator;
private int denominator;
}


// END
