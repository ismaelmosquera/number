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
* NumberSetFactory.java
*
* number-set
*
* Author: Ismael Mosquera Rivera
*
*/

package number;

/**
* The <code>NumberSetFactory</code> class produces objects for all number sets:
* <ul>
* <li>NaturalNumber ( N ).</li>
* <li>IntegerNumber ( Z ).</li>
* <li>RationalNumber ( Q ).</li>
* <li>RealNumber ( R ).</li>
* <li>ComplexNumber ( C ).</li>
* </ul>
* <p>
* @author Ismael Mosquera Rivera
*
*/
public final class NumberSetFactory
{

/**
* Makes a new instance for a <code>NaturalNumber</code> object.
* <p>
* @return new instance for a natural number.
*
*/
public static NaturalNumber natural()
{
return new NaturalNumber();
}

/**
* Makes a new instance for a <code>NaturalNumber</code> object.
* <p>
* @param n int value.
* <p>
* @return new instance of a natural number with initial parameter value.
*
*/
public static NaturalNumber natural(int n)
{
return new NaturalNumber(n);
}

/**
* Makes a new instance of a <code>NaturalNumber</code> object.
* <p>
* @param n A <code>NaturalNumber</code> object.
* <p>
* @return new instance of a natural number with its encapsulated value set to the one passed as parameter.
*
*/
public static NaturalNumber natural(NaturalNumber n)
{
return new NaturalNumber(n);
}

/**
* Makes a new instance for an <code>IntegerNumber</code> object.
* <p>
* @return new instance of an integer number.
*
*/
public static IntegerNumber integer()
{
return new IntegerNumber();
}

/**
* Makes a new instance for an <code>IntegerNumber</code> object.
* <p>
* @param z int value.
* <p>
* @return new instance for an integer number with initial parameter value.
*
*/
public static IntegerNumber integer(int z)
{
return new IntegerNumber(z);
}

/**
* Makes a new instance for an <code>IntegerNumber</code> object.
* <p>
* @param z A <code>IntegerNumber</code> object.
* <p>
* @return new instance of an integer number with initial parameter value.
*
*/
public static IntegerNumber integer(IntegerNumber z)
{
return new IntegerNumber(z);
}

/**
* Makes a new instance for an <code>IntegerNumber</code> object.
* <p>
* @param n A <code>NaturalNumber</code> object.
* <p>
* @return new instance of an integer number with initial parameter value.
*
*/
public static IntegerNumber integer(NaturalNumber n)
{
return new IntegerNumber(n);
}

/**
* Makes a new instance for a <code>RationalNumber</code> object.
* <p>
* @return new instance for a rational number.
*
*/
public static RationalNumber rational()
{
return new RationalNumber();
}

/**
* Makes a new instance of a <code>RationalNumber</code> object.
* <p>
* @param numerator int value.
* @param denominator int value.
* <p>
* @return new instance for a rational number with initial parameters.
*
*/
public static RationalNumber rational(int numerator, int denominator)
{
return new RationalNumber(numerator, denominator);
}

/**
* Makes a new instance for a <code>RationalNumber</code> object.
* <p>
* @param q A <code>RationalNumber</code> object.
* <p>
* @return new instance of a rational number with initial parameter value.
*
*/
public static RationalNumber rational(RationalNumber q)
{
return new RationalNumber(q);
}

/**
* Makes a new instance for a <code>RationalNumber</code> object.
* <p>
* @param z A <code>IntegerNumber</code> object.
* <p>
* @return new instance of a rational number with initial parameter value.
*
*/
public static RationalNumber rational(IntegerNumber z)
{
return new RationalNumber(z);
}

/**
* Makes a new instance for a <code>RationalNumber</code> object.
* <p>
* @param n A <code>NaturalNumber</code> object.
* <p>
* @return new instance of a rational number with initial parameter value.
*
*/
public static RationalNumber rational(NaturalNumber n)
{
return new RationalNumber(n);
}

/**
* Makes a new instance for a <code>RealNumber</code> object.
* <p>
* @return new instance for a real number.
*
*/
public static RealNumber real()
{
return new RealNumber();
}

/**
* Makes a new instance for a <code>RealNumber</code> object.
* <p>
* @param r A <code>double</code> value.
* <p>
* @return new instance for a real number.
*
*/
public static RealNumber real(double r)
{
return new RealNumber(r);
}

/**
* Makes a new instance for a <code>RealNumber</code> object.
* <p>
* @param r A <code>RealNumber</code> object.
* <p>
* @return new instance for a real number.
*
*/
public static RealNumber real(RealNumber r)
{
return new RealNumber(r);
}

/**
* Makes a new instance for a <code>RealNumber</code> object.
* <p>
* @param n A <code>NaturalNumber</code> object.
* <p>
* @return new instance for a real number.
*
*/
public static RealNumber real(NaturalNumber n)
{
return new RealNumber(n);
}

/**
* Makes a new instance for a <code>RealNumber</code> object.
* <p>
* @param z A <code>IntegerNumber</code> object.
* <p>
* @return new instance for a real number.
*
*/
public static RealNumber real(IntegerNumber z)
{
return new RealNumber(z);
}

/**
* Makes a new instance for a <code>RealNumber</code> object.
* <p>
* @param q A <code>RationalNumber</code> object.
* <p>
* @return new instance for a real number.
*
*/
public static RealNumber real(RationalNumber q)
{
return new RealNumber(q);
}

/**
* Static method to get an instance of a complex number.
* <p>
* @return A <code>ComplexNumber</code> object with default initial value.
*
*/
public static ComplexNumber complex()
{
return new ComplexNumber();
}

/**
* Static method to get an instance of a complex number.
* <p>
* @param real Value for the real part.
* @param imag Value for the imaginary part.
* <p>
* @return An instance of a complex number initialized with the parameter values.
*
*/
public static ComplexNumber complex(double real, double imag)
{
return new ComplexNumber(real, imag);
}

/**
* Static method to get an instance of a complex number.
* <p>
* @param c A <code>ComplexNumber</code> object ( copy constructor )
* <p>
* @return A new instance for a complex number.
*
*/
public static ComplexNumber complex(ComplexNumber c)
{
return new ComplexNumber(c);
}

/**
* Static method to get an instance of a complex number.
* <p>
* @param real A <code>RealNumber</code> object for the real part.
* @param imag A <code>RealNumber</code> object for the imaginary part.
* <p>
* @return A new instance for a complex number.
*
*/
public static ComplexNumber complex(RealNumber real, RealNumber imag)
{
return new ComplexNumber(real, imag);
}


// private constructor, so that this class cannot be instantiated
private NumberSetFactory() {}
}

// END
