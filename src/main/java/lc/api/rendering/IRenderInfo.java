/**
 * This file is part of the official LanteaCraft API. Please see the usage guide and
 * restrictions on use in the package-info file.
 */
package lc.api.rendering;

/**
 * Contract interface for rendering information providers.
 *
 * @author AfterLifeLochie
 *
 */
public interface IRenderInfo {

	/**
	 * @return A block rendering info provider
	 */
	public IBlockRenderInfo block();

	/**
	 * @return A tile rendering info provider
	 */
	public ITileRenderInfo tile();

	/**
	 * @return An entity rendering info provider
	 */
	public IEntityRenderInfo entity();
}
