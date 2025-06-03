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
* ComplexNumber.java
*
* number-set
*
* Author: Ismael Mosquera Rivera
*/

package number;

import java.text.NumberFormat;
import java.util.Locale;

/**
* The <code>ComplexNumber</code> class implements the most common operations applied to complex numbers.
* <p>
* A complex number has a real part and an imaginary part:
* <p>
* <code>(a + bi)</code>
* <p>
* You have to take in account that the imaginary unit is sqrt(-1) which is just a mathematical artifact
* <p>
* to represent it, since sqrt(-1) is not defined in the set of real numbers.
* <p>
* That is, if you attempt to compute such a function, your system will crash, like if you attempt to
* <p>
* divide by 0 since it is another operation not defined in mathematics.
* <p>
* So, the complex number set was invented in order to solve that mathematical issue.
* <p>
* We know:
* <p>
* The <code>ComplexNumber</code> set is a superset of <code>RealNumber</code> and is denoted by C.
* <p>
* So, R included in C.
* <p>
* Thus, N included in Z included in Q included in R included in C.
* <p>
* Basic operations:
* <ul>
* <li>Addition.</li>
* <li>Substraction.</li>
* <li>Multiplication.</li>
* <li>Division.</li>
* </ul>
* <p>
* Non-basic operations:
* <ul>
* <li>Trigonometric functions.</li>
* <li>Exponential.</li>
* <li>Some other useful functions.</li>
* </ul>
* <p>
* All of these implemented functions produce a value which also belongs to C.
* <p>
* @author Ismael Mosquera Rivera
*
*/
public class ComplexNumber implements Number
{

/**
* Constructor.
* <p>
* Makes a new instance for a <code>ComplexNumber</code> object.
*
*/
public ComplexNumber()
{
_real = 1.0;
_imag = 0.0;
}

/**
* Constructor.
* <p>
* Makes a new instance for a <code>ComplexNumber</code> object.
* <p>
* @param real Real part as a double value.
* @param imag Imaginary part as a double value.
*
*/
public ComplexNumber(double real, double imag )
{
this._real = real;
this._imag = imag;
}

/**
* Copy constructor.
* <p>
* Makes a new instance for a <code>ComplexNumber</code> object.
* <p>
* @param c A <code>ComplexNumber</code> object.
*
*/
public ComplexNumber(ComplexNumber c)
{
this._real = c.getReal();
this._imag = c.getImag();
}

/**
* Constructor.
* <p>
* Makes a new instance for a <code>ComplexNumber</code> object.
* <p>
* @param real A <code>RealNumber</code> object.
* @param imag A <code>RealNumber</code> object.
*
*/
public ComplexNumber(RealNumber real, RealNumber imag)
{
this._real = real.get();
this._imag = imag.get();
}

/**
* Gets the real part of this complex number as a double value.
* <p>
* @return real part of this complex number.
*
*/
public double getReal()
{
return this._real;
}

/**
* Gets the imaginary part of this complex number as a double value.
* <p>
* @return imaginary part of this complex number.
*
*/
public double getImag()
{
return this._imag;
}

/**
* Sets this complex number.
* <p>
* @param real A double value to set its real part.
* @param imag A double value to set its imaginary part.
*
*/
public void set(double real, double imag)
{
this._real = real;
this._imag = imag;
}

/**
* Sets the real part of this complex number.
* <p>
* @param real A double value to set its real part.
*
*/
public void setReal(double real)
{
this._real = real;
}

/**
* Sets the imaginary part of this complex number.
* <p>
* @param imag A double value to set its imaginary part.
*
*/
public void setImag(double imag)
{
this._imag = imag;
}

/**
* Adds this real number to another one.
* <p>
* @param c A <code>ComplexNumber</code> object.
* <p>
* @return this + c result, encapsulated in a <code>ComplexNumber</code> object.
*
*/
public ComplexNumber add(ComplexNumber c)
{
	return add(this, c);
}

/**
* substracts the complex number passed as parameter from this one.
* <p>
* @param c A <code>ComplexNumber</code> object.
* <p>
* @return this - c result, encapsulated in a <code>ComplexNumber</code> object.
*
*/
public ComplexNumber sub(ComplexNumber c)
{
return sub(this, c);
}

/**
* Multiplies this complex number by the one passed as parameter.
* <p>
* @param c A <code>ComplexNumber</code> object.
* <p>
* @return this * c result, encapsulated in a <code>ComplexNumber</code> object.
*
*/
public ComplexNumber mul(ComplexNumber c)
{
return mul(this, c);
}

/**
* divides this complex number by the one passed as parameter.
* <p>
* @param c A <code>ComplexNumber</code> object.
* <p>
* @return this / c result, encapsulated in a <code>ComplexNumber</code> object.
*
*/
public ComplexNumber div(ComplexNumber c)
{
return div(this, c);
}

/**
* Scales this complex number by the factor passed as parameter.
* <p>
* @param factor Amount to scale.
* <p>
* @return result encapsulated in a <code>ComplexNumber</code> object.
*
*/
public ComplexNumber scale(double factor)
{
return scale(this, factor);
}

/**
* Computes the magnitude of this complex number.
* <p>
* @return magnitude value encapsulated in a <code>RealNumber</code> object.
*
*/
public RealNumber mag()
{
return mag(this);
}

/**
* Computes the argument of this complex number.
* <p>
* @return argument encapsulated in a <code>RealNumber</code> object.
*
*/
public RealNumber arg()
{
return arg(this);
}

/**
* Gets the conjugated of this complex number.
* <p>
* @return conjugated encapsulated in a <code>ComplexNumber</code> object.
*
*/
public ComplexNumber conjugated()
{
return conjugated(this);
}

/**
* Gets the reciprocal of this complex number.
* <p>
* @return reciprocal encapsulated in a <code>ComplexNumber</code> object.
*
*/
public ComplexNumber reciprocal()
{
return reciprocal(this);
}

/**
* Computes the sine of this complex number.
* <p>
* @return sine encapsulated in a <code>ComplexNumber</code> object.
*
*/
public ComplexNumber sin()
{
return sin(this);
}

/**
* Computes the cosine of this complex number.
* <p>
* @return cosine encapsulated in a <code>ComplexNumber</code> object.
*
*/
public ComplexNumber cos()
{
return cos(this);
}

/**
* Computes the tangent of this complex number.
* <p>
* @return tangent encapsulated in a <code>ComplexNumber</code> object.
*
*/
public ComplexNumber tan()
{
return tan(this);
}

/**
* Computes the exponential of this complex number.
* <p>
* @return exponential encapsulated in a <code>ComplexNumber</code> object.
*
*/
public ComplexNumber exp()
{
return exp(this);
}

/**
* Gets a clone of this complex number.
* <p>
* Take in account that you must cast in order to obtain the desired result.
* <p>
* Example:
* <p>
* <code>ComplexNumber c = (ComplexNumber)a.clone();</code>
* <p>
* @return a clone of this complex number.
*
*/
public Object clone()
{
return new ComplexNumber(_real, _imag);
}

/**
* Evaluates for equality.
* <p>
* @param obj A <code>ComplexNumber</code> object, to compare to this one.
* <p>
* @return true if equal or false otherwise.
*
*/
public boolean equals(Object obj)
{
ComplexNumber c = (ComplexNumber)obj;
return (_real == c.getReal() && _imag == c.getImag());
}

/**
* Gets a string representation of this complex number.
* <p>
* The format is as follows:
* <p>
* <code>( a, bi )</code>
* <p>
* @return a string representation for this complex number.
*
*/
public String toString()
{
NumberFormat formatter = NumberFormat.getNumberInstance(Locale.US);
	formatter.setMinimumFractionDigits(2);
	formatter.setMaximumFractionDigits(2);
String s = "( "+formatter.format(_real)+", "+formatter.format(_imag)+"i )";
return s;
}

/**
* Static method to add two complex numbers.
* <p>
* @param c1 A <code>ComplexNumber</code> object.
* @param c2 A <code>ComplexNumber</code> object.
* <p>
* @return c1 + c2 result, encapsulated in a <code>ComplexNumber</code> object.
*
*/
public static ComplexNumber add(ComplexNumber c1, ComplexNumber c2)
{
double real = c1.getReal() + c2.getReal();
double imag = c1.getImag() + c2.getImag();
return new ComplexNumber(real, imag);
}

/**
* static method to substract two complex numbers.
* <p>
* @param c1 A <code>ComplexNumber</code> object.
* @param c2 A <code>ComplexNumber</code> object.
* <p>
* @return c1 - c2 result, encapsulated in a <code>ComplexNumber</code> object.
*
*/
public static ComplexNumber sub(ComplexNumber c1, ComplexNumber c2)
{
double real = c1.getReal() - c2.getReal();
double imag = c1.getImag() - c2.getImag();
return new ComplexNumber(real, imag);
}

/**
* Static method to multiply two complex numbers.
* <p>
* @param c1 A <code>ComplexNumber</code> object.
* @param c2 A <code>ComplexNumber</code> object.
* <p>
* @return c1 * c2 result, encapsulated in a <code>ComplexNumber</code> object.
*
*/
public static ComplexNumber mul(ComplexNumber c1, ComplexNumber c2)
{
double real = c1.getReal()*c2.getReal()-c1.getImag()*c2.getImag();
double imag = c1.getReal()*c2.getImag()+c1.getImag()*c2.getReal();
return new ComplexNumber(real, imag);
}

/**
* Static method to divide two complex numbers.
* <p>
* @param c1 A <code>ComplexNumber</code> object.
* @param c2 A <code>ComplexNumber</code> object.
* <p>
* @return c1 / c2 result, encapsulated in a <code>ComplexNumber</code> object.
*
*/
public static ComplexNumber div(ComplexNumber c1, ComplexNumber c2)
{
	return mul(c1, c2.reciprocal());
}

/**
* Static method to scale a complex number by a factor.
* <p>
* @param c A <code>ComplexNumber</code> object to be scaled.
* @param factor Scale factor as a double value.
* <p>
* @return scale result, encapsulated in a <code>ComplexNumber</code> object.
*
*/
public static ComplexNumber scale(ComplexNumber c, double factor)
{
return new ComplexNumber(c.getReal()*factor, c.getImag()*factor);
}

/**
* Computes the magnitude of a complex number.
* <p>
* @param c A <code>ComplexNumber</code> object.
* <p>
* @return magnitude value encapsulated in a <code>RealNumber</code> object.
*
*/
public static RealNumber mag(ComplexNumber c)
{
	return RealNumber.hypot(new RealNumber(c.getReal()), new RealNumber(c.getImag()));
}

/**
* Static method to compute the argument of a complex number.
* <p>
* @param c A <code>ComplexNumber</code> object.
* <p>
* @return argument value encapsulated in a <code>RealNumber</code> object.
*
*/
public static RealNumber arg(ComplexNumber c)
{
return RealNumber.atan2(new RealNumber(c.getImag()), new RealNumber(c.getReal()));
}

/**
* Static method to get the conjugated of a complex number.
* <p>
* @param c <code>ComplexNumber</code> object.
* <p>
* @return conjugated encapsulated in a <code>ComplexNumber</code> object.
*
*/
public static ComplexNumber conjugated(ComplexNumber c)
{
return new ComplexNumber(c.getReal(), -c.getImag());
}

/**
* Static method to compute the reciprocal of a complex number.
* <p>
* @param c A <code>ComplexNumber</code> object.
* <p>
* @return reciprocal encapsulated in a <code>ComplexNumber</code> object.
*
*/
public static ComplexNumber reciprocal(ComplexNumber c)
{
double sq = c.getReal()*c.getReal()+c.getImag()*c.getImag();
return new ComplexNumber(c.getReal()/sq, -c.getImag()/sq);
}

/**
* Static method to compute the sine of a complex number.
* <p>
* @param c A <code>ComplexNumber</code> object.
* <p>
* @return sine encapsulated in a <code>ComplexNumber</code> object.
*
*/
public static ComplexNumber sin(ComplexNumber c)
{
return new ComplexNumber(RealNumber.mul(RealNumber.sin(new RealNumber(c.getReal())),RealNumber.cosh(new RealNumber(c.getImag()))), RealNumber.mul(RealNumber.cos(new RealNumber(c.getReal())), RealNumber.sinh(new RealNumber(c.getImag()))));
}

/**
* Static method to compute the cosine of a complex number.
* <p>
* @param c A <code>ComplexNumber</code> object.
* <p>
* @return cosine encapsulated in a <code>ComplexNumber</code> object.
*
*/
public static ComplexNumber cos(ComplexNumber c)
{
	return new ComplexNumber(RealNumber.mul(RealNumber.cos(new RealNumber(c.getReal())),RealNumber.cosh(new RealNumber(c.getImag()))), RealNumber.mul(RealNumber.neg(RealNumber.sin(new RealNumber(c.getReal()))), RealNumber.sinh(new RealNumber(c.getImag()))));
}

/**
* Static method to compute the tangent of a complex number.
* <p>
* @param c A <code>ComplexNumber</code> object.
* <p>
* @return tangent encapsulated in a <code>ComplexNumber</code> object.
*
*/
public static ComplexNumber tan(ComplexNumber c)
{
return div(c.sin(), c.cos());
}

/**
* Static method to compute the exponential of a complex number.
* <p>
* @param c A <code>ComplexNumber</code > object.
* <p>
* @return exponential encapsulated in a <code>ComplexNumber</code> object.
*
*/
public static ComplexNumber exp(ComplexNumber c)
{
return new ComplexNumber(RealNumber.mul(RealNumber.exp(new RealNumber(c.getReal())), RealNumber.cos(new RealNumber(c.getImag()))), RealNumber.mul(RealNumber.exp(new RealNumber(c.getReal())), RealNumber.sin(new RealNumber(c.getImag()))));
}


private double _real; // real part
private double _imag; // imaginary part
}

// END
