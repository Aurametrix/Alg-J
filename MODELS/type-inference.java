for (Map.Entry<Integer, Map<Integer, SomeObject<SomeObject, T>>> row : table.entrySet()) {
    Integer rowKey = entry.getKey();
    Map<Integer, SomeObject<SomeObject, T>> rowValue = entry.getValue();
    for (Map.Entry<Integer, SomeObject<SomeObject, T>> col : rowValue.entrySet()) {
        Integer colKey = col.getKey();
        SomeObject<SomeObject, T> colValue = col.getValue();
        doSomethingWith<SomeObject<SomeObject, T>>(rowKey, colKey, colValue);
    }
}
