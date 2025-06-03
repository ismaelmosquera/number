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
* Number.java
*
* number-set
*
* Author: Ismael Mosquera Rivera
*
*/

package number;

/**
* The <code>Number</code> interface was define just to enable some kind of polymorphism.
* <p>
* @author Ismael Mosquera Rivera.
*
*/
public interface Number
{

/**
* Makes a clone of a number.
* <p>
* since this class returns <code>Object</code> you must cast it in order to get the desired result.
* <p>
* Example:
* <p>
* <code>Number n = (NaturalNumber)myNumber.clone();</code>
* <p>
* @return A clone of this object.
*
*/
public Object clone();

/**
* Evaluates for equality.
* <p>
* @param obj A <code>Number</code> object.
* <p>
* @return true if equal or false otherwise.
*
*/
public boolean equals(Object obj);

/**
* Gets a string representation of this number.
* <p>
* @return A string representation for this number.
*
*/
public String toString();

}

// END

