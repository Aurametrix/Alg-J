class ToStringIntHashMap {
  private static final __AlwaysAtomic __ByValue class Entry {
    final int key;
    final String value;
  }
  private Entry[] table;
  private Entry getEntry(int k1) {
    int idx = hash(k1) & (table.length-1);
    Entry e1 = table[idx];
        ; aload_0           // this
        ; getfield table    // this.table
        ; iload_2           // idx
        ; vaload            // table[idx]
        ; vstore_3          // e1
    int k2 = e1.key;
        ; vload_3
        ; vgetfield key     // e1.key
        ; istore_4          // k2
    if (k1 == k2)  return e1;
    {... else slow path ...}
  }
}
