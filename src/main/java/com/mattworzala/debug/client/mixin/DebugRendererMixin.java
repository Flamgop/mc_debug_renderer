package com.mattworzala.debug.client.mixin;

import com.mattworzala.debug.client.render.ClientRenderer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.debug.*;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.ai.pathing.WaterPathNodeMaker;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(DebugRenderer.class)
public class DebugRendererMixin {

    @Final @Shadow
    public PathfindingDebugRenderer pathfindingDebugRenderer;
    @Final @Shadow
    public DebugRenderer.Renderer waterDebugRenderer;
    @Final @Shadow
    public DebugRenderer.Renderer heightmapDebugRenderer;
    @Final @Shadow
    public DebugRenderer.Renderer collisionDebugRenderer;
    @Final @Shadow
    public DebugRenderer.Renderer neighborUpdateDebugRenderer;
    @Final @Shadow
    public StructureDebugRenderer structureDebugRenderer;
    @Final @Shadow
    public DebugRenderer.Renderer skyLightDebugRenderer;
    @Final @Shadow
    public DebugRenderer.Renderer worldGenAttemptDebugRenderer;
    @Final @Shadow
    public DebugRenderer.Renderer blockOutlineDebugRenderer;
    @Final @Shadow
    public DebugRenderer.Renderer chunkLoadingDebugRenderer;
    @Final @Shadow
    public VillageDebugRenderer villageDebugRenderer;
    @Final @Shadow
    public VillageSectionsDebugRenderer villageSectionsDebugRenderer;
    @Final @Shadow
    public BeeDebugRenderer beeDebugRenderer;
    @Final @Shadow
    public RaidCenterDebugRenderer raidCenterDebugRenderer;
    @Final @Shadow
    public GoalSelectorDebugRenderer goalSelectorDebugRenderer;
    @Final @Shadow
    public GameEventDebugRenderer gameEventDebugRenderer;

    @Inject(method = "render(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider$Immediate;DDD)V", at = @At("RETURN"))
    public void render(MatrixStack matrices, VertexConsumerProvider.Immediate vertexConsumers, double cameraX, double cameraY, double cameraZ, CallbackInfo ci) {

//        pathfindingDebugRenderer.render(matrices, vertexConsumers, cameraX, cameraY, cameraZ);
//        waterDebugRenderer.render(matrices, vertexConsumers, cameraX, cameraY, cameraZ);
//        heightmapDebugRenderer.render(matrices, vertexConsumers, cameraX, cameraY, cameraZ);
//        collisionDebugRenderer.render(matrices, vertexConsumers, cameraX, cameraY, cameraZ);
//        neighborUpdateDebugRenderer.render(matrices, vertexConsumers, cameraX, cameraY, cameraZ);
//        structureDebugRenderer.render(matrices, vertexConsumers, cameraX, cameraY, cameraZ);
//        skyLightDebugRenderer.render(matrices, vertexConsumers, cameraX, cameraY, cameraZ);
//        worldGenAttemptDebugRenderer.render(matrices, vertexConsumers, cameraX, cameraY, cameraZ);
//        blockOutlineDebugRenderer.render(matrices, vertexConsumers, cameraX, cameraY, cameraZ);
//        chunkLoadingDebugRenderer.render(matrices, vertexConsumers, cameraX, cameraY, cameraZ);
//        villageDebugRenderer.render(matrices, vertexConsumers, cameraX, cameraY, cameraZ);
//        villageSectionsDebugRenderer.render(matrices, vertexConsumers, cameraX, cameraY, cameraZ);
//        beeDebugRenderer.render(matrices, vertexConsumers, cameraX, cameraY, cameraZ);
//        raidCenterDebugRenderer.render(matrices, vertexConsumers, cameraX, cameraY, cameraZ);
//        goalSelectorDebugRenderer.render(matrices, vertexConsumers, cameraX, cameraY, cameraZ);
//        gameEventDebugRenderer.render(matrices, vertexConsumers, cameraX, cameraY, cameraZ);

        ClientRenderer.getInstance().render(matrices, vertexConsumers, cameraX, cameraY, cameraZ);
    }
}
