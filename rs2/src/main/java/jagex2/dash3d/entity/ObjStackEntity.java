package jagex2.dash3d.entity;

import jagex2.datastruct.Linkable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client.client!v")
public class ObjStackEntity extends Linkable {

	@OriginalMember(owner = "client.client!v", name = "e", descriptor = "I")
	public int index;

	@OriginalMember(owner = "client.client!v", name = "f", descriptor = "I")
	public int count;
}
