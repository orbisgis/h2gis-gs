/*
 * h2gis-gs is an extension to geoserver to connect H2GIS a spatial library 
 * that brings spatial support to the H2 Java database.
 *
 * h2gis-gs  is distributed under GPL 3 license. It is produced by the "Atelier SIG"
 * team of the IRSTV Institute <http://www.irstv.fr/> CNRS FR 2488.
 *
 * Copyright (C) 2014-2015 IRSTV (FR CNRS 2488)
 *
 * h2gis-gs  is free software: you can redistribute it and/or modify it under the
 * terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 *
 * h2gis-gs  is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * h2gis-gs. If not, see <http://www.gnu.org/licenses/>.
 *
 * For more information, please consult: <http://www.orbisgis.org/>
 * or contact directly:
 * info_at_ orbisgis.org
 */
package org.orbisgis.geoserver.h2gis;

import org.geoserver.data.DataStoreFactoryInitializer;
import org.orbisgis.geoserver.h2gis.datastore.H2GISDataStoreFactory;
import org.geoserver.platform.GeoServerResourceLoader;

/**
 * Initializes an H2GIS data store factory setting its location to the geoserver
 *  data directory.
 *
 * @author Erwan Bocher
 *
 */
public class H2GISDataStoreFactoryInitializer extends 
    DataStoreFactoryInitializer<H2GISDataStoreFactory> {

    GeoServerResourceLoader resourceLoader;
    
    /**
     * 
     */
    public H2GISDataStoreFactoryInitializer() {
        super( H2GISDataStoreFactory.class );
    }
    
    /**
     * 
     * @param resourceLoader 
     */
    public void setResourceLoader(GeoServerResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }
    
    @Override
    public void initialize(H2GISDataStoreFactory factory) {
        factory.setBaseDirectory(resourceLoader.getBaseDirectory() );
    }
}
