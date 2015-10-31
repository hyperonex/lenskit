/*
 * LensKit, an open source recommender systems toolkit.
 * Copyright 2010-2014 LensKit Contributors.  See CONTRIBUTORS.md.
 * Work on LensKit has been funded by the National Science Foundation under
 * grants IIS 05-34939, 08-08692, 08-12148, and 10-17697.
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program; if not, write to the Free Software Foundation, Inc., 51
 * Franklin Street, Fifth Floor, Boston, MA 02110-1301, USA.
 */
package org.grouplens.lenskit.util.table;

import java.util.List;

/**
 * A view of a column of a table.
 *
 * @author <a href="http://www.grouplens.org">GroupLens Research</a>
 */
public interface Column extends List<Object> {
    /**
     * Get the sum of this column.  Null entries result in a sum of NaN.
     *
     * @return The column's sum.
     * @throws IllegalArgumentException if there are any non-null, non-numeric entries in the
     *                                  table.
     */
    double sum();

    /**
     * Get the average of this column. Null entries and empty tables result in NaN.
     *
     * @return The column's average.
     * @throws IllegalArgumentException if there are any non-null, non-numeric entries in the
     *                                  table.
     */
    double average();
}