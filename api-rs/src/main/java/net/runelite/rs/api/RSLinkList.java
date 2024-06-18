package net.runelite.rs.api;

import net.runelite.api.LinkList;
import net.runelite.api.Linkable;
import net.runelite.mapping.Import;

public interface RSLinkList extends LinkList {
    @Import("addTail")
    void addTail$api(Linkable node);
    @Import("addHead")
    void addHead$api(Linkable node);
    @Import("removeHead")
    RSLinkable removeHead$api();
    @Import("head")
    RSLinkable head$api();
    @Import("tail")
    RSLinkable tail$api();
    @Import("next")
    RSLinkable next$api();
    @Import("prev")
    RSLinkable prev$api();
    @Import("sentinel")
    RSLinkable getSentinel();
    @Import("clear")
    void clear$api();
}
