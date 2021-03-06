/**
 * 
 * MIT License
 *
 * Copyright (c) 2017 BotMill.io
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 * 
 */
package co.aurasphere.botmill.witaiplg.json;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;


// TODO: Auto-generated Javadoc
/**
 * The Class SkipDeserializationAnnotationExclusionStrategy.
 * 
 * @author Alvin P. Reyes
 */
final class SkipDeserializationAnnotationExclusionStrategy implements
		ExclusionStrategy {

	/**
	 * Should skip field.
	 *
	 * @param f the f
	 * @return true, if successful
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.google.gson.ExclusionStrategy#shouldSkipField(com.google.gson.
	 * FieldAttributes)
	 */
	public boolean shouldSkipField(FieldAttributes f) {
		return f.getAnnotation(SkipDeserialization.class) != null;
	}

	/**
	 * Should skip class.
	 *
	 * @param clazz the clazz
	 * @return true, if successful
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.google.gson.ExclusionStrategy#shouldSkipClass(java.lang.Class)
	 */
	public boolean shouldSkipClass(Class<?> clazz) {
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SkipDeserializationAnnotationExclusionStrategy []";
	}
}