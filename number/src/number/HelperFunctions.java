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
* HelperFunctions.java
*
* number-set
*
* Author: Ismael Mosquera Rivera
*/

package number;


// Some shared functions with package scope.
final class HelperFunctions
{

public static int abs(int z)
{
	return (z < 0) ? -z : z;
}

public static double abs(double x)
{
return (x < 0.0) ? -x : x;
}

public static int factorial(int n)
{
if(n < 0) return 0;
if(n == 1 || n == 0) return 1;
return n*factorial(n-1);
}

public static int pow(int base, int exp)
{
	if(exp < 0) return 0;
	if(exp == 0) return 1;
	int p = base;
	for(int i = 1; i< exp; i++)
	{
	p *= base;
	}
	return p;
}

public static double pow(double base, int exp)
{
	if(exp < 0) return 1.0/pow(base, abs(exp));
	if(exp == 0) return 1.0;
	double x = base;
	for(int i = 1; i< exp; i++)
	{
	x *= base;
	}
	return x;
}


// private constructor so that this class cannot be instantiated
private HelperFunctions() {}
}

// END
