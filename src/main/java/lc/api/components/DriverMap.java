package lc.api.components;

import java.util.EnumSet;

import cpw.mods.fml.common.Loader;

/**
 * Driver list and wrapper class
 * 
 * @author AfterLifeLochie
 * 
 */
public enum DriverMap {
	/** IC2 power drivers */
	IC2("IndustrialCraft 2", "IC2", "lc.common.impl.drivers.DriverIC2Power", IntegrationType.POWER),
	/** Buildcraft power drivers */
	BUILDCRAFT("BuildCraft", "BuildCraft|Core", "lc.common.impl.drivers.DriverBCPower", IntegrationType.POWER);

	/** The target mod name */
	public final String modName;
	/** The target mod ID */
	public final String modId;
	/** The target class */
	public final String className;
	/** The target type */
	public final IntegrationType type;

	DriverMap(String modName, String modId, String className, IntegrationType type) {
		this.modName = modName;
		this.modId = modId;
		this.className = className;
		this.type = type;
	}

	/**
	 * Get a map of all drivers for a type of integration
	 * 
	 * @param typeof
	 *            The type of drivers
	 * @return A list of drivers which should be loaded
	 */
	public static EnumSet<DriverMap> mapOf(IntegrationType typeof) {
		EnumSet<DriverMap> map = EnumSet.noneOf(DriverMap.class);
		for (DriverMap mapping : values())
			if (mapping.type.equals(typeof) && Loader.isModLoaded(mapping.modId))
				map.add(mapping);
		return map;
	}

}
