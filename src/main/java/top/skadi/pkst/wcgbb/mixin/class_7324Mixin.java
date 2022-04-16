package top.skadi.pkst.wcgbb.mixin;

import net.minecraft.class_7323;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(class_7323.class_7324.class)
public class class_7324Mixin {
    @Inject(method = "getName", at = @At("RETURN"), cancellable = true)
    public void setNameToTranslatable(ItemStack stack, CallbackInfoReturnable<Text> cir) {
        cir.setReturnValue(new TranslatableText("block.minecraft.generic_item_block"));
    }
}
