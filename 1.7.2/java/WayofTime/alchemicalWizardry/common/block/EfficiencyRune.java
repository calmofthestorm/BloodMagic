package WayofTime.alchemicalWizardry.common.block;

import net.minecraft.client.renderer.texture.IIconRegister;
import WayofTime.alchemicalWizardry.AlchemicalWizardry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EfficiencyRune extends BloodRune
{
    public EfficiencyRune()
    {
        super();
        //setUnlocalizedName("efficiencyRune");
        setCreativeTab(AlchemicalWizardry.tabBloodMagic);
        setHardness(2.0F);
        setResistance(5.0F);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        this.blockIcon = iconRegister.registerIcon("AlchemicalWizardry:EfficiencyRune");
    }

    @Override
    public int getRuneEffect(int metaData)
    {
        return 2;
    }
}
