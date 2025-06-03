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
* RealNumber.java
*
* number-set
*
* Author: Ismael Mosquera rivera
*/

package number;

/**
* The <code>RealNumber</code> class implements functionallity to operate with real numbers.
* <p>
* The real number set denoted by R includes all the rational and irrational numbers.
* <p>
* R = {-rn ... -r2, -r1, 0, r1, r2, ... rn} )-infinity(r)..+infinity(r(
	* <p>
	* Basic supported operations:
	* <ul>
	* <li>Addition.</li>
	* <li>Substraction.</li>
	* <li>Multiplication.</li>
	* <li>Division.</li>
	* </ul>
	* <p>
	* So that after any of the above operations, the result is also included in R.
	* <p>
	* Non-basic supported operations:
	* <ul>
	* <li>Abs ( absolute value ).</li>
	* <li>Power.</li>
	* <li>Trigonometric functions ( sin, cos, tan ... ).</li>
	* <li>Hyperbolic functions, sinh, cosh, tanh ...</li>
	* <li>log, log2, log10, exp, sqrt, curt, ithrt ...</li>
	* <li>Some other useful functions.</li>
	* </ul>
	* <p>
	* where the resulting value is also included in R.
	* <p>
	* Notice that Q is included in R. So, since Z included in Q and N included in Z thus, N and Z included in R.
	* <p>
	* This class uses assertions. So, you must enable it by using the '-ea' modifier at execution time.
	* <p>
	* Example:
	* <p>
	* <code>java -ea MyApp</code>
	* <p>
	* @author Ismael Mosquera Rivera.
	*
	*/
public class RealNumber implements Number
{

/**
* Static constant to get the value of the number 'e' ( base of the natural logarithm ).
*
*/
public static final double e;

/**
* Static constant to get the value of 'pi' where pi = L/d, being L the circunference length, and d its diameter.
*
*/
public static final double pi;

/**
* Constructor.
* <p>
* Makes a new instance for a real number.
* <p>
* The encapsulated real number is set to zero.
*
*/
public RealNumber()
{
_r = 0.0;
}

/**
* Constructor.
* <p>
* Makes a new instance of a real number.
* <p>
* @param r A <code>double</code> value.
*
*/
public RealNumber(double r)
{
this._r = r;
}

/**
* Copy constructor.
* <p>
* Makes a new instance of a real number.
* <p>
* @param r A <code>RealNumber</code> object.
*
*/
public RealNumber(RealNumber r)
{
this(r.get());
}


/**
* Constructor.
* <p>
* Makes a new instance of a real number from a <code>RationalNumber</code> object.
* <p>
* @param q A <code>RationalNumber</code> object.
*
*/
public RealNumber(RationalNumber q)
{
this(getValue(q));
}


/**
* Constructor.
* <p>
* Makes a new instance of a real number from an <code>IntegerNumber</code> object.
* <p>
* @param z A <code>IntegerNumber</code> object.
*
*/
public RealNumber(IntegerNumber z)
{
this((double)z.get());
}

/**
* Constructor.
* <p>
* Makes a new instance of a real number from a <code>NaturalNumber</code> object.
* <p>
* @param n A <code>NaturalNumber</code> object.
*
*/
public RealNumber(NaturalNumber n)
{
this((double)n.get());
}

/**
* Gets the encapsulated value in this real number.
* <p>
* @return encapsulated <code>double</code> of this real number.
*
*/
public double get()
{
return this._r;
}

/**
* Sets the value for this real number.
* <p>
* @param r A <code>double</code> value.
*
*/
public void set(double r)
{
this._r = r;
}

/**
* Adds a real number to this one.
* <p>
* @param r A <code>RealNumber</code> object.
* <p>
* @return this + r
*
*/
public RealNumber add(RealNumber r)
{
return add(this, r);
}

/**
* Substracts a real number from this one.
* <p>
* @param r A <code>RealNumber</code> object.
* <p>
* @return this - r
*
*/
public RealNumber sub(RealNumber r)
{
return sub(this, r);
}

/**
* Multiplies a real number by this one.
* <p>
* @param r A <code>RealNumber</code> object.
* <p>
* @return this * r
*
*/
public RealNumber mul(RealNumber r)
{
return mul(this, r);
}

/**
* Divides this real number by the one passed as parameter.
* <p>
* @param r A <code>RealNumber</code> object.
* <p>
* @return this / r
*
*/
public RealNumber div(RealNumber r)
{
return div(this, r);
}

/**
* Gets the integer part of this real number as a <code>RealNumber</code> object.
* <p>
* @return integer part of this real number.
*
*/
public RealNumber intPart()
{
return intPart(this);
}

/**
* Gets the decimal part of this real number as a <code>RealNumber</code> object.
* <p>
* @return decimal part of this real number.
*
*/
public RealNumber decPart()
{
return decPart(this);
}

/**
* Gets the absolute value of this real number.
* <p>
* @return absolute value encapsulated in a <code>RealNumber</code> object.
*
*/
public RealNumber abs()
{
return abs(this);
}

/**
* Computes the remainder between this real number and the one passed as parameter.
* <p>
* @param r A <code>RealNumber</code> object.
* <p>
* @return remainder encapsulated in a <code>RealNumber</code> object.
*
*/
public RealNumber fmod(RealNumber r)
{
return fmod(this, r);
}

/**
* Gets the sign of this real number.
* <p>
* @return 1.0 if possitive or -1.0 otherwise; encapsulated in a <code>RealNumber</code> object.
*
*/
public RealNumber sign()
{
return sign(this);
}

/**
* Gets the negation of this real number.
* <p>
* @return negation of this real number, encapsulated in a <code>RealNumber</code> object.
*
*/
public RealNumber neg()
{
return neg(this);
}

/**
* Gets the greatest between the integer part of this real number and the next integer.
* <p>
* @return ceil result, encapsulated in a <code>RealNumber</code> object.
*
*/
public RealNumber ceil()
{
return ceil(this);
}

/**
* Gets the lowest ( integer part ) of this real number.
* <p>
* @return floor result, encapsulated in a <code>RealNumber</code> object.
*
*/
public RealNumber floor()
{
return floor(this);
}

/**
* Rouns this real number.
* <p>
* @return rounded result, encapsulated in a <code>RealNumber</code> object.
*
*/
public RealNumber round()
{
return round(this);
}

/**
* Convers radians to degrees ( sexagesimal ).
* <p>
* @return degrees encapsulated in a <code>RealNumber</code> object.
*
*/
public RealNumber toDegrees()
{
return toDegrees(this);
}

/**
* Converts degrees ( sexagesimal ) to radians.
* <p>
* @return radians encapsulated in a <code>RealNumber</code> object.
*
*/
public RealNumber toRadians()
{
return toRadians(this);
}

/**
* Gets the maximun value between this real number and the one passed as parameter.
* <p>
* @param r A <code>RealNumber</code> object.
* <p>
* @return maximum value encapsulated in a <code>RealNumber</code> object.
*
*/
public RealNumber max(RealNumber r)
{
return max(this, r);
}

/**
* Gets the minimum value between this real number and the one passed as parameter.
* <p>
*@param r A <code>RealNumber</code> object.
* <p>
* @return minimum value encapsulated in a <code>RealNumber</code> object.
*
*/
public RealNumber min(RealNumber r)
{
return min(this, r);
}

/**
* Computes the cosine of this real number.
* <p>
* @return cosine encapsulated in a <code>RealNumber</code> object.
*
*/
public RealNumber cos()
{
return cos(this);
}

/**
* Computes the sine of this real number.
* <p>
* @return sine encapsulated in a <code>RealNumber</code> object.
*
*/
public RealNumber sin()
{
	return sin(this);
}

/**
* Computes the tangent of this real number.
* <p>
* @return tangent encapsulated in a <code>RealNumber</code> object.
*
*/
public RealNumber tan()
{
return tan(this);
}

/**
* Computes the arctangent of this real number.
* <p>
* @return arctangent encapsulated in a <code>RealNumber</code> object.
*
*/
public RealNumber atan()
{
return atan(this);
}

/**
* Computes the arcosine of this real number.
* <p>
* @return arcosine encapsulated in a <code>RealNumber</code> object.
*
*/
public RealNumber acos()
{
return acos(this);
}

/**
* Computes the arcsine of this real number.
* <p>
* @return arcsine encapsulated in a <code>RealNumber</code> object.
*
*/
public RealNumber asin()
{
return asin(this);
}

/**
* Computes the hyperbolic cosine of this real number.
* <p>
* @return hyperbolic cosine encapsulated in a <code>RealNumber</code> object.
*
*/
public RealNumber cosh()
{
return cosh(this);
}

/**
* Computes the hyperbolic sine of this real number.
* <p>
* @return hyperbolic sine encapsulated in a <code>RealNumber</code> object.
*
*/
public RealNumber sinh()
{
return sinh(this);
}

/**
* Computes the hyperbolic tangent of this real number.
* <p>
* @return hyperbolic sine encapsulated in a <code>RealNumber</code> object.
*
*/
public RealNumber tanh()
{
return tanh(this);
}

/**
* Computes the hyperbolic arctangent of this real number.
* <p>
* @return hyperbolic arctangent encapsulated in a <code>RealNumber</code> object.
*
*/
public RealNumber atanh()
{
return atanh(this);
}

/**
* Computes the exponential of this real number.
* <p>
* @return exponential encapsulated in a <code>RealNumber</code> object.
*
*/
public RealNumber exp()
{
return exp(this);
}

/**
* Computes the natural logarithm of this real number.
* <p>
* @return natural logarithm encapsulated in a <code>RealNumber</code> object.
*
*/
public RealNumber log()
{
return log(this);
}

/**
* Computes the base 2 logarithm of this real number.
* <p>
* @return base 2 logarithm encapsulated in a <code>RealNumber</code> object.
*
*/
public RealNumber log2()
{
return log2(this);
}

/**
* Computes the base 10 logarithm of this real number.
* <p>
* @return base 10 logarithm encapsulated in a <code>RealNumber</code> object.
*
*/
public RealNumber log10()
{
return log10(this);
}

/**
* Raises this real number to the power value passed as parameter.
* <p>
* @param r A <code>RealNumber</code> object, containing the power value.
* <p>
* @return this^exp, where exp is the encapsulated value in the parameter.
*
*/
public RealNumber pow(RealNumber r)
{
return pow(this, r);
}

/**
* Raises this real number to the power value passed as parameter.
* @param q A <code>RationalNumber</code> object, containing the power value.
* <p>
* @return this^q, where q encapsulates the power value.
*
*/
public RealNumber pow(RationalNumber q)
{
return pow(this, q);
}

/**
* Raises this real number to the power value passed as parameter.
* <p>
* @param z A <code>IntegerNumber</code> object containing the power value.
* <p>
* @return this^z, where z encapsulates the power value.
*
*/
public RealNumber pow(IntegerNumber z)
{
return pow(this, z);
}

/**
* Raises this real number to the power value passed as parameter.
* <p>
* @param n A <code>RealNumber</code> object containing the power value.
* <p>
* @return this^n, where n encapsulates the power value.
*
*/
public RealNumber pow(NaturalNumber n)
{
return pow(this, n);
}

/**
* Computes the square of this real number.
* <p>
* @return square value encapsulated in a <code>RealNumber</code> object.
*
*/
public RealNumber square()
{
return square(this);
}

/**
* Computes the square root of this real number.
* <p>
* @return square root value encapsulated in a <code>RealNumber</code> object.
*
*/
public RealNumber sqrt()
{
return sqrt(this);
}

/**
* Computes the cubic root of this real number.
* <p>
* @return cubic root value encapsulated in a <code>RealNumber</code> object.
*
*/
public RealNumber curt()
{
	return curt(this);
}


public RealNumber ithrt(NaturalNumber ithindex)
{
return ithrt(this, ithindex);
}

/**
* Gets a clone of this real number.
* <p>
* Take in account that you must cast the returned value in order to get the right result.
* <p>
* Example:
* <p>
* <code>RealNumber r1 = (RealNumber)r.clone();</code>
* <p>
* @return a clone of this real number.
*
*/
public Object clone()
{
return new RealNumber(this._r);
}

/**
* Evaluates for equality.
* <p>
* @param obj A <code>RealNumber</code> object.
* <p>
* @return true if equal or false otherwise.
*
*/
public boolean equals(Object obj)
{
RealNumber r = (RealNumber)obj;
return (this._r == r.get());
}

/**
* Gets a string representation of this real number.
* <p>
* @return string representation according to the value enccapsulated in this real number.
*
*/
public String toString()
{
String s = "";
return s+_r;
}

/**
* Static method to get the decimal part of the real number passed as parameter.
* <p>
* @param r A <code>RealNumber</code> object.
* <p>
* @return decimal part value, encapsulated in a <code>RealNumber</code> object.
*
*/
public static RealNumber decPart(RealNumber r)
{
double _int = intPart(r).get();
return new RealNumber(r.get() - _int);
}

/**
* Static method to get the integer part of the real number passed as parameter.
* <p>
* @param r A <code>RealNumber</code> object.
* <p>
* @return integer part encapsulated in a <code>RealNumber</code> object.
*
*/
public static RealNumber intPart(RealNumber r)
{
int _int = (int)r.get();
return new RealNumber((double)_int);
}

/**
* Static method to add two real numbers.
* <p>
* @param r1 A <code>RealNumber</code> object.
* <p>
* @param r2 A <code>RealNumber</code> object.
* <p>
* @return r1 + r2, encapsulated in a <code>RealNumber</code> object.
*
*/
public static RealNumber add(RealNumber r1, RealNumber r2)
{
return new RealNumber(r1.get() + r2.get());
}

/**
* Static method to substract two real numbers.
* <p>
* @param r1 A <code>RealNumber</code> object.
* <p>
* @param r2 A <code>RealNumber</code> object.
* <p>
* @return r1 - r2, encapsulated in a <code>RealNumber</code> object.
*
*/
public static RealNumber sub(RealNumber r1, RealNumber r2)
{
return new RealNumber(r1.get() - r2.get());
}

/**
* Static method to multiply two real numbers.
* <p>
* @param r1 A <code>RealNumber</code> object.
* <p>
* @param r2 A <code>RealNumber</code> object.
* <p>
* @return r1 * r2, encapsulated in a <code>RealNumber</code> object.
*
*/
public static RealNumber mul(RealNumber r1, RealNumber r2)
{
return new RealNumber(r1.get() * r2.get());
}

/**
* Static method to divide two real numbers.
* <p>
* @param r1 A <code>RealNumber</code> object.
* <p>
* @param r2 A <code>RealNumber</code> object.
* <p>
* @return r1 / r2, encapsulated in a <code>RealNumber</code> object.
*
*/
public static RealNumber div(RealNumber r1, RealNumber r2)
{
	double x = r2.get();
assert (x != 0.0): "RealNumber -> nethod div: divisor must be != 0";
return new RealNumber(r1.get() / r2.get());
}

/**
* Static method to get the absolute value of the real number passed as parameter
* <p>
* @param r A <code>RealNumber</code> object.
* <p>
* @return absolute value encapsulated in a <code>RealNumber</code> object.
*
*/
public static RealNumber abs(RealNumber r)
{
return new RealNumber(HelperFunctions.abs(r.get()));
}

/**
* Static method to compute the remainder for a division of two floating point numbers.
* <p>
* @param r1 A <code>RealNumber</code> object.
* @param r2 A <code>RealNumber</code> object.
* <p>
* @return remainder encapsulated in a <code>RealNumber</code> object.
*
*/
public static RealNumber fmod(RealNumber r1, RealNumber r2)
{
	double x2 = r2.get();
	assert (x2 != 0.0): "RealNumber -> fmod method: divide by 0.";
	double x1 = r1.get();
	double s = (sign(x1) != sign(x2)) ? -1.0 : 1.0;
	x1 = HelperFunctions.abs(x1);
	x2 = HelperFunctions.abs(x2);
	while(x1 >= x2)
	{
		x1 -= x2;
	}
	return new RealNumber(s * x1);
}

/**
* Static method to get the sign of the real number passed as parameter.
* <p>
* @param r A <code>RealNumber</code> object.
* <p>
* @return sign ( -1 or 1 ) encapsulated in a <code>RealNumber</code> object.
*
*/
public static RealNumber sign(RealNumber r)
{
return new RealNumber(sign(r.get()));
}

/**
* Static method to negate the real number passed as parameter.
* <p>
* @param r A <code>RealNumber</code> object.
* <p>
* @return negation encapsulated in a <code>RealNumber</code> object.
*
*/
public static RealNumber neg(RealNumber r)
{
double x = r.get();
return new RealNumber(-x);
}

/**
* Static method to Get the greatest between the integer part of a real number and the next integer.
* <p>
* @param r A <code>RealNumber</code> object.
* <p>
* @return ceil result, encapsulated in a <code>RealNumber</code> object.
*
*/
public static RealNumber ceil(RealNumber r)
{
	double v = r.get();
double x = decPart(r).abs().get();
if(x == 0) return new RealNumber((double)((int)v));
double _sign = r.sign().get();
double z = (_sign < 0.0) ? (double)((int)v) : (double)((int)v) + 1.0;
return new RealNumber(z);
}

/**
* Static method to get the less integer part of a real number as a real number too.
* <p>
* @param r A <code>RealNumber</code> object.
* <p>
* @return floor result encapsulated in a <code>RealNumber</code> object.
*
*/
public static RealNumber floor(RealNumber r)
{
double v = r.get();
double x = decPart(r).abs().get();
if(x == 0.0) return new RealNumber((double)((int)v));
double _sign = r.sign().get();
double z = (_sign < 0.0) ? (double)((int)v)-1.0 : (double)((int)v);
return new RealNumber(z);
}

/**
* Static method to round a real number to its next or prior integer.
* <p>
* @param r A <code>RealNumber</code> object.
* <p>
* @return rounded value encapsulated in a <code>RealNumber</code> object.
*
*/
public static RealNumber round(RealNumber r)
{
	if(r.get() == 0.0) return new RealNumber(0.0);
double x = decPart(r).abs().get();
if(x == 0.0) return intPart(r);
 if(r.get() > 0.0)
 {
	 return (x >= 0.5) ? ceil(r) : floor(r);
 }
 return (x >= 0.5) ? floor(r) : ceil(r);
}

/**
* Static method to convert radians to degrees ( sexagesimal ).
* <p>
* @param r A <code>RealNumber</code> object containing the value in radians.
* <p>
* @return degrees value encapsulated in a <code>RealNumber</code> object.
*
*/
public static RealNumber toDegrees(RealNumber r)
{
double radians = r.get();
double degrees = radians * 180.0 / pi;
return new RealNumber(degrees);
}

/**
* Static method to convert degrees ( sexagesimal ) to radians.
* <p>
* @param r A <code>RealNumber</code> object containing the degrees value.
* <p>
* @return radians value encapsulated in a <code>RealNumber</code> object.
*
*/
public static RealNumber toRadians(RealNumber r)
{
double degrees = r.get();
double radians = degrees * pi / 180.0;
return new RealNumber(radians);
}

/**
* Static method to get the maximum between two real numbers.
* <p>
* @param r1 A <code>RealNumber</code> object.
* @param r2 A <code>RealNumber</code> object.
* <p>
* @return maximum value encapsulated in a <code>RealNumber</code> object.
*
*/
public static RealNumber max(RealNumber r1, RealNumber r2)
{
	double x = r1.get();
	double y = r2.get();
	double _max = (x >= y) ? x : y;
	return new RealNumber(_max);
}

/**
* Static method to get the mimimum value between two real numbers.
* <p>
* @param r1 A <code>RealNumber</code> object.
* @param r2 A <code>RealNumber</code> object.
* <p>
* @return minimum value encapsulated in a <code>RealNumber</code> object.
*
*/
public static RealNumber min(RealNumber r1, RealNumber r2)
{
double x = r1.get();
double y = r2.get();
double _min = (x < y) ? x : y;
return new RealNumber(_min);
}

/**
* Computes the factorial.
* <p>
* This method returns a real value thus, we can compute factorials for bigger values.
* <p>
* @param z A <code>IntegerNumber</code> object.
* <p>
* @return factorial value encapsulated in a <code>RealNumber</code> object.
*
*/
public static RealNumber factorial(IntegerNumber z)
{
double f = factorial(z.get());
return new RealNumber(f);
}

/**
* Static method to compute sqrt(x^2+y^2).
* <p>
* That is, the equivalent as the magnitude of a 2-dimensional vector.
* <p>
* In other words, the Pitagoras theorem.
* <p>
* @param r1 A <code>RealNumber</code> object.
* @param r2 A <code>RealNumber</code> object.
* <p>
* @return result encapsulated in a <code>RealNumber</code> object.
*
*/
public static RealNumber hypot(RealNumber r1, RealNumber r2)
{
return sqrt(add(square(r1), square(r2)));
}

/**
* Static method to compute the cosine of an angle expressed in radians.
* <p>
* @param r A <code>RealNumber</code> object, with the value of the angle expressed in radians.
* <p>
* @return cosine value of the angle encapsulated in a <code>RealNumber</code> object.
*
*/
public static RealNumber cos(RealNumber r)
{
return sincos(r, COS);
}

/**
* Static method to compute the sine of an angle expressed in radians.
* <p>
* @param r A <code>RealNumber</code> object, with the value of the angle expressed in radians.
* <p>
* @return sine value of the angle encapsulated in a <code>RealNumber</code> object.
*
*/
public static RealNumber sin(RealNumber r)
{
return sincos(r, SIN);
}

/**
* Static method to compute the arccosine for a value expressed in radians.
* <p>
* @param r A <code>RealNumber</code> object, with the value expressed in radians.
* <p>
* @return arccosine value encapsulated in a <code>RealNumber</code> object.
*
*/
public static RealNumber acos(RealNumber r)
{
double _acos = pi/2.0-asin(r).get();
return new RealNumber(_acos);
}

/**
* Static method to compute the arcsine for a value expressed in radians.
* <p>
* @param r A <code>RealNumber</code> object, with the value expressed in radians.
* <p>
* @return arcsine value encapsulated in a <code>RealNumber</code> object.
*
*/
public static RealNumber asin(RealNumber r)
{
double x = r.get();
if(x == 1.0) return new RealNumber(pi/2.0);
if(x == -1.0) return new RealNumber(-pi/2.0);
double _asin = 0.0;
for(int n = 0; n < SERIES_LENGTH-70; n++)
{
	_asin += (factorial(2*n)*HelperFunctions.pow(x, 2*n+1)) / (HelperFunctions.pow(4.0, n)*(double)(2*n+1)*square(factorial(n)));
}
return new RealNumber(_asin);
}

/**
* Static method to compute the tangent for the value passed as parameter.
* <p>
* @param r A <code>RealNumber</code> object.
* <p>
* @return tangent value encapsulated in a <code>RealNumber</code> object.
*
*/
public static RealNumber tan(RealNumber r)
{
return div(sin(r), cos(r));
}

/**
* Static method to compute the arctangent of a value.
* <p>
* @param r A <code>RealNumber</code> object.
* <p>
* @return arctangent value encapsulated in a <code>RealNumber</code> object.
*
*/
public static RealNumber atan(RealNumber r)
{
	double x = r.get();
	if(HelperFunctions.abs(x) < 1.0) return new RealNumber(__atan_(x));
	/*
	* According Euler's proog:
	* 1/sqrt(1+x^2) = cos( atan(x) )
	*/
	double y = 1.0 / sqrt(add(new RealNumber(1.0), square(r))).get();
	/*
	* thus, acos(1/sqrt(1+z^2)) = atan(x)
	*/
	return mul(r.sign(), acos(new RealNumber(y)));
}

/**
* Static method to compute the arctangent, like as in the <code>atan</code> method, but this time taken two parameters.
* <p>
* @param r1 A <code>RealNumber</code> object.
* @param r2 A <code>RealNumber</code> object.
* <p>
* @return result encapsulated in a <code>RealNumber</code> object.
*
*/
public static RealNumber atan2(RealNumber r1, RealNumber r2)
{
	if(r2.get() == 0.0) return mul(r1.sign(), new RealNumber(pi/2.0));
	RealNumber r = abs(div(r1, r2));
	return mul(r1.sign(),atan(r));
}

/**
* Static method to compute the hyperbolic cosine of a real number.
* <p>
* @param r A <code>RealNumber</code> object.
* <p>
* @return hyperbolic cosine value encapsulated in a <code>RealNumber</code> object.
*
*/
public static RealNumber cosh(RealNumber r)
{
return sincosh(r, COS);
}

/**
* Static method to compute the hyperbolic sine of a real number.
* <p>
* @param r A <code>RealNumber</code> object.
* <p>
* @return hyperbolic sine value encapsulated in a <code>RealNumber</code> object.
*
*/
public static RealNumber sinh(RealNumber r)
{
return sincosh(r, SIN);
}

/**
* Static method to compute the hyperbolic tangent of a real number.
* <p>
* @param r A <code>RealNumber</code> object.
* <p>
* @return hyperbolic tangent value encapsulated in a <code>RealNumber</code> object.
*
*/
public static RealNumber tanh(RealNumber r)
{
return div(sinh(r), cosh(r));
}

/**
* Static method to compute the hyperbolic arctangent of a real number.
* <p>
* @param r A <code>RealNumber</code> object.
* <p>
* @return hyperbolic tangent value encapsulated in a <code>RealNumber</code> object.
*
*/
public static RealNumber atanh(RealNumber r)
{
double x = r.get();
double _atanh = 0.0;
for(int n = 1; n < SERIES_LENGTH; n+=2)
{
	_atanh += HelperFunctions.pow(x, n)/(double )n;
}
return new RealNumber(_atanh);
}


/**
* Static method to compute the exponential function, 'exp(x)'.
* <p>
* The exponential function is the inverse of the 'log' function.
* <p>
* Where 'log' is the natural logarithm function.
* <p>
* @param r A <code>RealNumber</code> object to compute its exponential.
* <p>
* @return exponential of r.
*
*/
public static RealNumber exp(RealNumber r)
{
double _exp = 0.0;
for(int n = 0; n <= SERIES_LENGTH; n++)
{
_exp += HelperFunctions.pow(r.get(), n) / factorial(n);
}
return new RealNumber(_exp);
}

/**
* Static method to compute the natural logarithm of a real number.
* <p>
* The natural logarithm has base = 'e'.
* <p>
* The natural logarithm is useful to compute any logarithm of base 'b'.
* <p>
* Since loga of b = log(b)/log(a)
* <p>
* where 'a' is the base of the logarithm, and b is the value to calculate its loga value.
* <p>
* So, if you want to compute the log2(8),
* <p>
* You can do as follows:
* <p>
* log2(8) = log(8)/log(2) = 3
* <p>
* @param r A <code>RealNumber</code> object.
* <p>
* @return logarithm value encapsulated in a <code>RealNumber</code> object.
*
*/
public static RealNumber log(RealNumber r)
{
double x = r.get();
if(x <= 100.0) return __log_(r);
double _count = 0.0;
double d = 100.0;
while(x >= d)
{
x /= d;
_count += 1.0;
}
double _log = __log_(new RealNumber(100.0)).get() * _count + __log_(new RealNumber(x)).get();
return new RealNumber(_log);
}

/**
* Static method to compute the log2(x), where x is a real number.
* <p>
* Remember that log2(x) = log(x)/log(2)
* <p>
* @param r A <code>RealNumber</code> object.
* <p>
* @return log2(x) value encapsulated in a <code>RealNumber</code> object.
*
*/
public static RealNumber log2(RealNumber r)
{
return div(log(r), log(new RealNumber(2.0)));
}

/**
* Static method to compute the log10(x), where x is a real number.
* <p>
* Remember that log10(x) = log(x)/log(10)
* <p>
* @param r A <code>RealNumber</code> object.
* <p>
* @return log10(x) value encapsulated in a <code>RealNumber</code> object.
*
*/
public static RealNumber log10(RealNumber r)
{
return div(log(r), log(new RealNumber(10.0)));
}

/**
* Static method to compute the power of a real number.
* <p>
* Since the exponent can be a fractional number,
* <p>
* we are able to compute even ith roots for a value.
* <p>
* The ith root of a value can be expressed as:
* <p>
* double ithroot = pow(x, 1.0/ithindex);
* <p>
* where 'x' is the value to compute its ithroot, and ith index is the radical index.
* <p>
* Obiously, you can also compute powers for non-dicimal values.
* <p>
* @param base A <code>RealNumber</code> object.
* @param exp A <code>RealNumber</code> object.
* <p>
* @return base^exp encapsulated in a <code>RealNumber</code> object.
*
*/
public static RealNumber pow(RealNumber base, RealNumber exp)
{
	double x = base.get();
	double y = exp.get();
	if(x == 0.0) return new RealNumber(0.0);
	if(y == 0.0) return new RealNumber(1.0);
	if(x < 0.0 || y < 0.0) return pow(base, new IntegerNumber((int)y));
	return exp(mul(log(base), exp));
}

/**
* Static method to raise a real number to an exponent power.
* <p>
* @param base A <code>RealNumber</code> object.
* @param exp A <code>RationalNumber</code> object.
* <p>
* @return base^exp value encapsulated in a <code>RealNumber</code> object.
*
*/
public static RealNumber pow(RealNumber base, RationalNumber exp)
{
	double x = base.get();
	double y = getValue(exp);
	if(x < 0 || y < 0) return pow(base, new IntegerNumber((int)y));
	return pow(base, new RealNumber(y));
}

/**
* Static method to raise a real number to an exponent power.
* <p>
* @param base A <code>RealNumber</code> object.
* @param exp A <code>IntegerNumber</code> object.
* <p>
* @return base^exp value encapsulated in a <code>RealNumber</code> object.
*
*/
public static RealNumber pow(RealNumber base, IntegerNumber exp)
{
return new RealNumber(HelperFunctions.pow(base.get(), exp.get()));
}

/**
* Static method to raise a real number to an exponent power.
* <p>
* @param base A <code>RealNumber</code> object.
* @param exp A <code>NaturalNumber</code> object.
* <p>
* @return base^exp value encapsulated in a <code>RealNumber</code> object.
*
*/
public static RealNumber pow(RealNumber base, NaturalNumber exp)
{
return pow(base, new IntegerNumber(exp.get()));
}

/**
* Static method to compute the square of a real number.
* <p>
* @param r A <code>RealNumber</code> object.
* <p>
* @return square value encapsulated in a <code>RealNumber</code> object.
*
*/
public static RealNumber square(RealNumber r)
{
double x = r.get();
return new RealNumber(x * x);
}

/**
* Static method to compute the square root of a real number.
* <p>
* @param r A <code>RealNumber</code> object.
* <p>
* @return square root value encapsulated in a <code>RealNumber</code> object.
*
*/
public static RealNumber sqrt(RealNumber r)
{
	double x = r.get();
	assert (x >= 0.0): "RealNumber -> sqrt method: Bad parameter value. It must be >= 0.";
return pow(r, new RealNumber(1.0/2.0));
}

/**
* Static method to compute the cubic root of a real number.
* <p>
* Notice that, since a cubic root has an odd index, it can be take negative values as parameter.
* <p>
* @param r A <code>RealNumber</code> object.
* <p>
* @return square root value encapsulated in a <code>RealNumber</code> object.
*
*/
public static RealNumber curt(RealNumber r)
{
	return mul(r.sign(), pow(r.abs(), new RealNumber(1.0/3.0)));
}

/**
* Static method to compute the ith root of a real number.
* <p>
* The ith index is a positive integer number greater than zero.
* <p>
* That is, root index must be in the range [1 .. n] {1, 2, 3, .. n}
* <p>
* Even the given range, it is useful just to [2 .. n].
* <p>
* @param x A <code>RealNumber</code> object.
* @param ithindex A <code>Natural Number</code> object.
* <p>
* @return ith root value encapsulated in a <code>RealNumber</code> object.
*
*/
public static RealNumber ithrt(RealNumber x, NaturalNumber ithindex)
{
	double _sign = x.sign().get();
	int n = ithindex.get();
	if(n % 2 == 0 && _sign == -1.0) assert(false): "RealNumber -> ithrt method: not defined for negative values of x when the index of the radical is odd.";
return mul(x.sign(), pow(x.abs(), new RealNumber(1.0/(double)n)));

}

/* private method to get the sign of a real number. */
private static double sign(double x)
{
return (x < 0.0) ? -1.0 : 1.0;
}

/*
* Compute e by using the Euler's method.
* e = 1/ f(0)+1/f(1) + 1/f(2) + 1/f(3) + 1/f(4) ...
* where f(n) is the factorial function.
*/
private static double e()
{
double _e = 0.0;
for(int i = 0; i <= SERIES_LENGTH; i++)
{
_e += 1.0 / factorial(i);
}
return _e;
}

/* private method to compute the 'pi' constant. */
private static double pi()
{
return 4.0*(5.0*__atan_(1.0/7.0) + 2.0*__atan_(3.0/79.0));
}

/* convenient private method to compute factorial returning a double value */
private static double factorial(int n)
{
if(n == 0) return 1.0;
if(n == 1) return 1.0;
return (double)n*factorial(n-1);
}

/* private method to compute the sine or cosine given an extra parameter */
private static RealNumber sincos(RealNumber r, int type)
{
double x = fmod(r, new RealNumber(2.0*pi)).get();
double _sincos = 0.0;
double sign = 1.0;
int n = type;
while(n < SERIES_LENGTH)
{
_sincos += sign * HelperFunctions.pow(x, n) / factorial(n);
sign *= -1.0;
n += 2;
}
return new RealNumber(_sincos);
}

/* private method to compute the hyperbolic sine or cosine given a extra parameter. */
private static RealNumber sincosh(RealNumber r, int type)
{
double x = fmod(r, new RealNumber(2.0*pi)).get();
double _sincosh = 0.0;
int n = type;
while(n < SERIES_LENGTH)
{
_sincosh += HelperFunctions.pow(x, n) / factorial(n);
n += 2;
}
return new RealNumber(_sincosh);
}

/* private method to compute the arctangent for abs(x) < 1.0 */
private static double __atan_(double x)
{
double _atan = 0.0;
double sign = 1.0;
for(int n = 1; n < SERIES_LENGTH; n+=2)
{
_atan += sign * HelperFunctions.pow(x, n) / (double )n;
sign *= -1.0;
}
return _atan;
}

/* private method to compute the natural logarithm for x <= 100 */
private static RealNumber __log_(RealNumber r)
{
	double x = r.get();
	assert (x > 0.0): "RealNumber -> log method: parameter must be greater than zero.";
	RealNumber _r_ = new RealNumber();
	double aux = x - 1.0;
	double _log = aux;
	for(int n = 0; n <= SERIES_LENGTH; n++)
	{
		_r_.set(aux);
	_log = aux + 2.0 * (x - exp(_r_).get()) / (x + exp(_r_).get());
	aux = _log;
	}
return new RealNumber(_log);
}

/* private convenient method to compute the square of a real value. */
private static double square(double x)
{
return x*x;
}

/* private method to compute the value of a rational number. */
private static double getValue(RationalNumber q)
{
	int d = q.getDenominator();
	assert (d != 0): "RationalNumber: divide by 0.";
return (double)q.getNumerator() / (double)q.getDenominator();
}


static
{
	/* Compute 'e' number just once. */
e = e();

/* compute 'pi' number just once. */
pi = pi();
}


private double _r;
private static final int COS = 0;
private static final int SIN = 1;
private static final int SERIES_LENGTH = 150;
}

// END
