/*
 * todesbaum-lib - 
 * Copyright (C) 2006 David Roden
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
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA 02111-1307, USA.
 */

package net.sf.thingamablog.util.freenet.fcp;

/**
 * Implementation of the <code>GenerateSSK</code> command.
 * <p>
 * The node can answer with the following messages: <code>SSKKeypair</code>.
 * 
 * @author David Roden &lt;droden@gmail.com&gt;
 * @version $Id: GenerateSSK.java 9647 2006-07-17 18:24:50Z bombe $
 */
public class GenerateSSK extends Command {

	/**
	 * Creates a new <code>GenerateSSK</code> request.
	 */
	public GenerateSSK() {
		super("GenerateSSK", null);
	}

}
