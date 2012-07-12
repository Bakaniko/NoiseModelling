/**
 * NoiseMap is a scientific computation plugin for OrbisGIS to quickly evaluate the
 * noise impact on European action plans and urban mobility plans. This model is
 * based on the French standard method NMPB2008. It includes traffic-to-noise
 * sources evaluation and sound propagation processing.
 *
 * This version is developed at French IRSTV Institute and at IFSTTAR
 * (http://www.ifsttar.fr/) as part of the Eval-PDU project, funded by the
 * French Agence Nationale de la Recherche (ANR) under contract ANR-08-VILL-0005-01.
 *
 * Noisemap is distributed under GPL 3 license. Its reference contact is Judicaël
 * Picaut <judicael.picaut@ifsttar.fr>. It is maintained by Nicolas Fortin
 * as part of the "Atelier SIG" team of the IRSTV Institute <http://www.irstv.fr/>.
 *
 * Copyright (C) 2011 IFSTTAR
 * Copyright (C) 2011-1012 IRSTV (FR CNRS 2488)
 *
 * Noisemap is free software: you can redistribute it and/or modify it under the
 * terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 *
 * Noisemap is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * Noisemap. If not, see <http://www.gnu.org/licenses/>.
 *
 * For more information, please consult: <http://www.orbisgis.org/>
 * or contact directly:
 * info_at_ orbisgis.org
 */
package org.noisemap.core;

import com.vividsolutions.jts.geom.Coordinate;

/**
 * 
 * @author Nicolas Fortin
 */
public class MirrorReceiverResult {

	private Coordinate receiverPos; // Coordinate of mirrored receiver
	private int mirrorResultId = -1; // Other MirrorReceiverResult index, -1 for
										// the first reflexion
	private int wallId = 0; // Wall index of the last mirrored processed

	public Coordinate getReceiverPos() {
		return receiverPos;
	}

	public void setReceiverPos(Coordinate receiverPos) {
		this.receiverPos = receiverPos;
	}

	public int getMirrorResultId() {
		return mirrorResultId;
	}

	public void setMirrorResultId(int mirrorResultId) {
		this.mirrorResultId = mirrorResultId;
	}

	public int getWallId() {
		return wallId;
	}

	public void setWallId(int wallId) {
		this.wallId = wallId;
	}

	public MirrorReceiverResult(Coordinate receiverPos, int mirrorResultId,
			int wallId) {
		super();
		this.receiverPos = receiverPos;
		this.mirrorResultId = mirrorResultId;
		this.wallId = wallId;
	}

}
