package net.runelite.api;

public interface LinkList {
    void addTail$api(Linkable node);
    void addHead$api(Linkable node);
    Linkable removeHead$api();
    Linkable head$api();
    Linkable tail$api();
    Linkable next$api();
    Linkable prev$api();
    Linkable getSentinel();
    void clear$api();
}
