/*
 * Licensed under the EUPL, Version 1.2.
 * You may obtain a copy of the Licence at:
 * https://joinup.ec.europa.eu/collection/eupl/eupl-text-eupl-12
 */

package net.dries007.tfc.client.model.entity;

import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

import com.mojang.math.Constants;
import net.dries007.tfc.client.model.animation.AnimationChannel;
import net.dries007.tfc.client.model.animation.AnimationDefinition;
import net.dries007.tfc.client.model.animation.Keyframe;
import net.dries007.tfc.client.model.animation.VanillaAnimations;
import net.dries007.tfc.common.entities.prey.Pest;

public class RatModel extends HierarchicalAnimatedModel<Pest>
{
    public static final AnimationDefinition RAT_SNIFF = AnimationDefinition.Builder.withLength(3f)
        .addAnimation("Head", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.16666666666666666f, VanillaAnimations.degreeVec(-10f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.75f, VanillaAnimations.degreeVec(-10.627584138330803f, 19.683498079413766f, -3.616441573002703f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1.875f, VanillaAnimations.degreeVec(-10.627584138330803f, 19.683498079413766f, -3.616441573002703f), AnimationChannel.Interpolations.LINEAR), new Keyframe(2.75f, VanillaAnimations.degreeVec(-10.627584138330695f, -19.683498079413603f, 3.6164415730035033f), AnimationChannel.Interpolations.LINEAR), new Keyframe(3f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
        .addAnimation("ears", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.3333333333333333f, VanillaAnimations.degreeVec(-10f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.5416666666666666f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
        .addAnimation("nose", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0.875f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1.0416666666666667f, VanillaAnimations.degreeVec(10f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1.2916666666666667f, VanillaAnimations.degreeVec(-2.5f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1.375f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1.5416666666666667f, VanillaAnimations.degreeVec(10f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1.7916666666666667f, VanillaAnimations.degreeVec(-2.5f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(2.125f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(2.2916666666666665f, VanillaAnimations.degreeVec(10f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(2.5416666666666665f, VanillaAnimations.degreeVec(-2.5f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(2.625f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR))).build();
    public static final AnimationDefinition RAT_WALK = AnimationDefinition.Builder.withLength(0.5416666666666666f).looping()
        .addAnimation("Body", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.125f, VanillaAnimations.degreeVec(0f, 5f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.25f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.375f, VanillaAnimations.degreeVec(0f, -5f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.5f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
        .addAnimation("Head", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, VanillaAnimations.degreeVec(-1.7763568394002505e-14f, 1.7763568394002505e-14f, -5.093148125467906e-13f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.125f, VanillaAnimations.degreeVec(-5.019001817489916f, -4.980925321928935f, 0.4368798417743528f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.375f, VanillaAnimations.degreeVec(-5.042923270466872f, 7.47129704892086f, -0.6573984636520436f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.5f, VanillaAnimations.degreeVec(-0.042558862559908484f, -0.028700870291031855f, -0.6517958524129063f), AnimationChannel.Interpolations.LINEAR)))
        .addAnimation("LFfoot", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.125f, VanillaAnimations.degreeVec(0f, -25f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.25f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.375f, VanillaAnimations.degreeVec(0f, 25f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.5f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
        .addAnimation("LBfoot", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.125f, VanillaAnimations.degreeVec(0f, 25f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.25f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.375f, VanillaAnimations.degreeVec(0f, -25f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.5f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
        .addAnimation("RFfoot", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.125f, VanillaAnimations.degreeVec(0f, -25f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.25f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.375f, VanillaAnimations.degreeVec(0f, 25f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.5f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
        .addAnimation("RBfoot", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.125f, VanillaAnimations.degreeVec(0f, 25f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.25f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.375f, VanillaAnimations.degreeVec(0f, -25f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.5f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
        .addAnimation("Tail", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.125f, VanillaAnimations.degreeVec(0f, -7.5f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.25f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.375f, VanillaAnimations.degreeVec(0f, 2.5f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.5f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR))).build();
    public static final AnimationDefinition RAT_SEARCH = AnimationDefinition.Builder.withLength(4.333333333333333f)
        .addAnimation("Body", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.75f, VanillaAnimations.degreeVec(-70f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(3.875f, VanillaAnimations.degreeVec(-70f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(4.333333333333333f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
        .addAnimation("Head", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.75f, VanillaAnimations.degreeVec(25f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1f, VanillaAnimations.degreeVec(26.78134622152129f, 20.293483231822847f, 9.929259506229755f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1.25f, VanillaAnimations.degreeVec(26.78134622152129f, 20.293483231822847f, 9.929259506229755f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1.4583333333333333f, VanillaAnimations.degreeVec(24.9999999999998f, 3.552713678800501e-14f, 1.0729195309977513e-12f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1.875f, VanillaAnimations.degreeVec(24.9999999999998f, 3.552713678800501e-14f, 1.0729195309977513e-12f), AnimationChannel.Interpolations.LINEAR), new Keyframe(2.3333333333333335f, VanillaAnimations.degreeVec(25.76926213169054f, -13.56626037096612f, -6.460664808925685f), AnimationChannel.Interpolations.LINEAR), new Keyframe(2.5f, VanillaAnimations.degreeVec(38.26926213169055f, -13.566260370965956f, -6.460664808925649f), AnimationChannel.Interpolations.LINEAR), new Keyframe(2.75f, VanillaAnimations.degreeVec(27.644262131690667f, -13.566260370965956f, -6.460664808925649f), AnimationChannel.Interpolations.LINEAR), new Keyframe(2.9583333333333335f, VanillaAnimations.degreeVec(25.76926213169054f, -13.56626037096612f, -6.460664808925685f), AnimationChannel.Interpolations.LINEAR), new Keyframe(3.375f, VanillaAnimations.degreeVec(24.9999999999998f, 3.552713678800501e-14f, 1.0729195309977513e-12f), AnimationChannel.Interpolations.LINEAR), new Keyframe(3.875f, VanillaAnimations.degreeVec(25f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(4.333333333333333f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
        .addAnimation("LFfoot", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.75f, VanillaAnimations.degreeVec(57.5f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1.125f, VanillaAnimations.degreeVec(92.5f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1.5f, VanillaAnimations.degreeVec(32.5f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1.9166666666666667f, VanillaAnimations.degreeVec(92.5f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(2.2916666666666665f, VanillaAnimations.degreeVec(32.5f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(2.5833333333333335f, VanillaAnimations.degreeVec(92.5f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(2.9583333333333335f, VanillaAnimations.degreeVec(32.5f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(3.25f, VanillaAnimations.degreeVec(92.5f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(3.625f, VanillaAnimations.degreeVec(32.5f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(3.7916666666666665f, VanillaAnimations.degreeVec(57.5f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(3.875f, VanillaAnimations.degreeVec(57.5f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(4.333333333333333f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
        .addAnimation("LBfoot", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.75f, VanillaAnimations.degreeVec(72.5f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(3.875f, VanillaAnimations.degreeVec(72.5f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(4.333333333333333f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
        .addAnimation("RFfoot", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.75f, VanillaAnimations.degreeVec(55f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1.125f, VanillaAnimations.degreeVec(22.5f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1.5f, VanillaAnimations.degreeVec(90f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1.9166666666666667f, VanillaAnimations.degreeVec(22.5f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(2.2916666666666665f, VanillaAnimations.degreeVec(90f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(2.5833333333333335f, VanillaAnimations.degreeVec(22.5f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(2.9583333333333335f, VanillaAnimations.degreeVec(90f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(3.25f, VanillaAnimations.degreeVec(22.5f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(3.625f, VanillaAnimations.degreeVec(90f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(3.7916666666666665f, VanillaAnimations.degreeVec(55f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(3.875f, VanillaAnimations.degreeVec(55f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(4.333333333333333f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
        .addAnimation("RBfoot", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.75f, VanillaAnimations.degreeVec(70f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(3.875f, VanillaAnimations.degreeVec(70f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(4.333333333333333f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
        .addAnimation("Tail", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.75f, VanillaAnimations.degreeVec(70f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(3.875f, VanillaAnimations.degreeVec(70f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(4.333333333333333f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
        .addAnimation("nose", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(1.125f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1.2916666666666667f, VanillaAnimations.degreeVec(10f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1.5416666666666667f, VanillaAnimations.degreeVec(-2.5f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1.625f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(2.4166666666666665f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(2.5833333333333335f, VanillaAnimations.degreeVec(10f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(2.8333333333333335f, VanillaAnimations.degreeVec(-2.5f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(2.9166666666666665f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(3.0833333333333335f, VanillaAnimations.degreeVec(10f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(3.3333333333333335f, VanillaAnimations.degreeVec(-2.5f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(3.4166666666666665f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR))).build();
    public static final AnimationDefinition RAT_EAT = AnimationDefinition.Builder.withLength(2.7083333333333335f).looping()
        .addAnimation("Body", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.3333333333333333f, VanillaAnimations.degreeVec(-82.5f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(2f, VanillaAnimations.degreeVec(-82.5f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(2.625f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
        .addAnimation("Head", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.3333333333333333f, VanillaAnimations.degreeVec(95f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.4583333333333333f, VanillaAnimations.degreeVec(100f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.5833333333333334f, VanillaAnimations.degreeVec(95f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.7083333333333334f, VanillaAnimations.degreeVec(100f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.8333333333333334f, VanillaAnimations.degreeVec(95f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.9583333333333334f, VanillaAnimations.degreeVec(100f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1.0833333333333333f, VanillaAnimations.degreeVec(95f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1.2083333333333333f, VanillaAnimations.degreeVec(100f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1.3333333333333333f, VanillaAnimations.degreeVec(95f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1.4583333333333333f, VanillaAnimations.degreeVec(100f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1.5833333333333333f, VanillaAnimations.degreeVec(95f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1.7083333333333333f, VanillaAnimations.degreeVec(100f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1.8333333333333333f, VanillaAnimations.degreeVec(95f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(2f, VanillaAnimations.degreeVec(95f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(2.625f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
        .addAnimation("LFfoot", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.3333333333333333f, VanillaAnimations.degreeVec(70f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(2f, VanillaAnimations.degreeVec(70f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(2.625f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
        .addAnimation("LBfoot", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.3333333333333333f, VanillaAnimations.degreeVec(90f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(2f, VanillaAnimations.degreeVec(90f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(2.625f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
        .addAnimation("RFfoot", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.3333333333333333f, VanillaAnimations.degreeVec(70f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(2f, VanillaAnimations.degreeVec(70f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(2.625f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
        .addAnimation("RBfoot", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.3333333333333333f, VanillaAnimations.degreeVec(92.5f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(2f, VanillaAnimations.degreeVec(92.5f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(2.625f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
        .addAnimation("Tail", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.3333333333333333f, VanillaAnimations.degreeVec(82.5f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(2f, VanillaAnimations.degreeVec(82.5f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(2.625f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
        .addAnimation("ears", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.625f, VanillaAnimations.degreeVec(-22.5f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1.3333333333333333f, VanillaAnimations.degreeVec(-22.5f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1.4583333333333333f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(2.625f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
        .addAnimation("nose", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0.3333333333333333f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.4583333333333333f, VanillaAnimations.degreeVec(20f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.5833333333333334f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.7083333333333334f, VanillaAnimations.degreeVec(20f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.8333333333333334f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.9583333333333334f, VanillaAnimations.degreeVec(20f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1.0833333333333333f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1.2083333333333333f, VanillaAnimations.degreeVec(20f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1.3333333333333333f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1.4583333333333333f, VanillaAnimations.degreeVec(20f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1.5833333333333333f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1.7083333333333333f, VanillaAnimations.degreeVec(20f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1.8333333333333333f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(2f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR))).build();
    public static final AnimationDefinition RAT_DRAG = AnimationDefinition.Builder.withLength(1f).looping()
        .addAnimation("Body", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.6666666666666666f, VanillaAnimations.degreeVec(2.5f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.9583333333333334f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
        .addAnimation("Head", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, VanillaAnimations.degreeVec(7.5f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.6666666666666666f, VanillaAnimations.degreeVec(-2.5f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.9583333333333334f, VanillaAnimations.degreeVec(7.5f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
        .addAnimation("LFfoot", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.6666666666666666f, VanillaAnimations.degreeVec(0f, -40f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.9583333333333334f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
        .addAnimation("LBfoot", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.6666666666666666f, VanillaAnimations.degreeVec(0f, -60f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.9583333333333334f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
        .addAnimation("RFfoot", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.6666666666666666f, VanillaAnimations.degreeVec(0f, 40f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.9583333333333334f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
        .addAnimation("RBfoot", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.6666666666666666f, VanillaAnimations.degreeVec(0f, 60f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.9583333333333334f, VanillaAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR))).build();

    public static LayerDefinition createBodyLayer()
    {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -2.3F, -5.0F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 23.0F, 2.0F));

        PartDefinition LFfoot = Body.addOrReplaceChild("LFfoot", CubeListBuilder.create().texOffs(10, 10).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.1F, 0.0F, -4.2F));

        PartDefinition LBfoot = Body.addOrReplaceChild("LBfoot", CubeListBuilder.create().texOffs(7, 9).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.1F, 0.0F, -0.1F));

        PartDefinition RFfoot = Body.addOrReplaceChild("RFfoot", CubeListBuilder.create().texOffs(0, 4).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.1F, 0.0F, -4.2F));

        PartDefinition RBfoot = Body.addOrReplaceChild("RBfoot", CubeListBuilder.create().texOffs(0, 2).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.1F, 0.0F, -0.1F));

        PartDefinition Tail = Body.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(6, 0).addBox(-0.5F, 0.6F, 0.9F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition Head = Body.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 9).addBox(-1.0F, -1.3F, -3.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -5.0F));

        PartDefinition nose = Head.addOrReplaceChild("nose", CubeListBuilder.create().texOffs(10, 12).addBox(-0.5F, -0.4F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -3.0F));

        PartDefinition ears = Head.addOrReplaceChild("ears", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -2.3F, 0.1F, 3.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -1.0F));

        return LayerDefinition.create(meshdefinition, 32, 32);
    }

    private final ModelPart head;

    public RatModel(ModelPart root)
    {
        super(root);
        this.head = root.getChild("Body").getChild("Head");
    }

    @Override
    public void setupAnim(Pest entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch)
    {
        super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);

        this.animate(entity.walkingAnimation, RAT_WALK, ageInTicks, getAdjustedLandSpeed(entity));
        this.animate(entity.eatingAnimation, RAT_EAT, ageInTicks);
        this.animate(entity.searchingAnimation, RAT_SEARCH, ageInTicks);
        this.animate(entity.sniffingAnimation, RAT_SNIFF, ageInTicks);
        this.animate(entity.draggingAnimation, RAT_DRAG, ageInTicks);

        if (!entity.searchingAnimation.isStarted() && !entity.sniffingAnimation.isStarted() && !entity.draggingAnimation.isStarted() && !entity.eatingAnimation.isStarted())
        {
            this.head.xRot = headPitch * Constants.DEG_TO_RAD;
            this.head.yRot = netHeadYaw * Constants.DEG_TO_RAD;
        }
    }

}
