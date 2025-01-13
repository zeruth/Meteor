package jagex2.dash3d.entity;

import jagex2.datastruct.Linkable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client.client!lb")
public class LocAddEntity extends Linkable {

	@OriginalMember(owner = "client.client!lb", name = "e", descriptor = "I")
	public int plane;

	@OriginalMember(owner = "client.client!lb", name = "f", descriptor = "I")
	public int layer;

	@OriginalMember(owner = "client.client!lb", name = "g", descriptor = "I")
	public int x;

	@OriginalMember(owner = "client.client!lb", name = "h", descriptor = "I")
	public int z;

	@OriginalMember(owner = "client.client!lb", name = "i", descriptor = "I")
	public int locIndex;

	@OriginalMember(owner = "client.client!lb", name = "j", descriptor = "I")
	public int angle;

	@OriginalMember(owner = "client.client!lb", name = "k", descriptor = "I")
	public int shape;

	@OriginalMember(owner = "client.client!lb", name = "l", descriptor = "I")
	public int lastLocIndex;

	@OriginalMember(owner = "client.client!lb", name = "m", descriptor = "I")
	public int lastAngle;

	@OriginalMember(owner = "client.client!lb", name = "n", descriptor = "I")
	public int lastShape;
}
