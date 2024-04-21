package mixin;

import meteor.events.DrawFinished;
import net.runelite.api.Callbacks;
import net.runelite.api.mixins.*;
import net.runelite.rs.api.RSClient;

@SuppressWarnings("ALL")
@Mixin(RSClient.class)
abstract class Client implements RSClient {
    @Shadow("client")
    public static RSClient client;

    @Inject
    private Callbacks callbacks;

    @Inject
    @Override
    public void setCallbacks(Callbacks callbacks) {
        this.callbacks = callbacks;
    }

    @Inject
    @Override
    public Callbacks getCallbacks() {
        return this.callbacks;
    }

    @Inject
    @MethodHook(value = "draw", end = true)
    public void draw$post() {
        getCallbacks().post(DrawFinished.INSTANCE);
    }

    @Copy("load")
    @Replace("load")
    public void load() {
        try {
            load();
        } catch (NoClassDefFoundError error) {
            //TODO: investigate this failure, it's weird.
            //simply calling WordFilter.unpack(wordenc)
            //even with an empty obj and empty code will cause the error
            //even though WordFilter has no initialization...
            error.printStackTrace();
        }
    }
}
