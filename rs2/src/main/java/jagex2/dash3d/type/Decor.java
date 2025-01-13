package jagex2.dash3d.type;

import jagex2.graphics.Model;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client.client!h")
public class Decor {

	@OriginalMember(owner = "client.client!h", name = "a", descriptor = "I")
	public int y;

	@OriginalMember(owner = "client.client!h", name = "b", descriptor = "I")
	public int x;

	@OriginalMember(owner = "client.client!h", name = "c", descriptor = "I")
	public int z;

	@OriginalMember(owner = "client.client!h", name = "d", descriptor = "I")
	public int type;

	@OriginalMember(owner = "client.client!h", name = "e", descriptor = "I")
	public int angle;

	@OriginalMember(owner = "client.client!h", name = "f", descriptor = "Lclient!eb;")
	public Model model;

	@OriginalMember(owner = "client.client!h", name = "g", descriptor = "I")
	public int bitset;

	@OriginalMember(owner = "client.client!h", name = "h", descriptor = "B")
	public byte info;
}
