package cn.nukkit.level.sound;

import cn.nukkit.math.Vector3;
import cn.nukkit.network.protocol.LevelEventPacket;

/**
 * Created by Pub4Game on 28.06.2016.
 */
@Deprecated
public class ExperienceOrbSound extends GenericSound {
    public ExperienceOrbSound(Vector3 pos) {
        this(pos, 0);
    }

    public ExperienceOrbSound(Vector3 pos, float pitch) {
        super(pos, LevelEventPacket.EVENT_SOUND_EXPERIENCE_ORB, pitch);
    }
}
