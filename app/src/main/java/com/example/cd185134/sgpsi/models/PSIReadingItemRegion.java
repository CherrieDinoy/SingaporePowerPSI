package com.example.cd185134.sgpsi.models;

/**
 * this is interface for provide psi item data per region
 * for example if want to get psi only for east region
 * Created by cherrie on 5/23/2018.
 */

public interface PSIReadingItemRegion {
    /**
     * for getting psi data based on region
     *
     * @param region {@link String} of region, the value should be like <p>
     *               {@value PSIReadingsItem#EAST},
     *               {@value PSIReadingsItem#NATIONAL},
     *               {@value PSIReadingsItem#CENTRAL},
     *               {@value PSIReadingsItem#WEST},
     *               {@value PSIReadingsItem#NORTH},
     *               {@value PSIReadingsItem#SOUTH}
     *               </p>
     */
    double getData(String region);
}
