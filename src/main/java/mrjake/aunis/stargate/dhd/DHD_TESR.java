package mrjake.aunis.stargate.dhd;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;

public class DHD_TESR extends TileEntitySpecialRenderer<DHDTile> {
	
	//private Map<DHDTile, DHDRenderer> DHDRendererMap = new HashMap<DHDTile, DHDRenderer>();
	
	@Override
	public void render(DHDTile te, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {		
		te.getRenderer().render(x, y, z, partialTicks);
	}
}
