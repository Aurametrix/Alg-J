var map = new HashMap<String, Integer>();
words.forEach(word -> {
    var prev = map.get(word);
    if (prev == null) {
        map.put(word, 1);
    } else {
        map.put(word, prev + 1);
    }
});

var words = List.of("Foo", "Bar", "Foo", "Buzz", "Foo", "Buzz", "Fizz", "Fizz");
//...
{Bar=1, Fizz=2, Foo=3, Buzz=2}

words.forEach(word -> {
    map.putIfAbsent(word, 0);
    map.put(word, map.get(word) + 1);
});

words.forEach(word -> {
    map.putIfAbsent(word, 0);
    map.computeIfPresent(word, (w, prev) -> prev + 1);
});

words.forEach(word ->
        map.compute(word, (w, prev) -> prev != null ? prev + 1 : 1)
);

default V merge(K key, V value, BiFunction<V, V, V> remappingFunction) {
    V oldValue = get(key);
    V newValue = (oldValue == null) ? value :
               remappingFunction.apply(oldValue, value);
    if (newValue == null) {
        remove(key);
    } else {
        put(key, newValue);
    }
    return newValue;
}

words.forEach(word ->
        map.merge(word, 1, (prev, one) -> prev + one)
);

class Operation {
    private final String accNo;
    private final BigDecimal amount;
}
And a bunch of operations for different accounts:

var operations = List.of(
    new Operation("123", new BigDecimal("10")),
    new Operation("456", new BigDecimal("1200")),
    new Operation("123", new BigDecimal("-4")),
    new Operation("123", new BigDecimal("8")),
    new Operation("456", new BigDecimal("800")),
    new Operation("456", new BigDecimal("-1500")),
    new Operation("123", new BigDecimal("2")),
    new Operation("123", new BigDecimal("-6.5")),
    new Operation("456", new BigDecimal("-600"))
);


var balances = new HashMap<String, BigDecimal>();
 
operations.forEach(op -> {
    var key = op.getAccNo();
    balances.putIfAbsent(key, BigDecimal.ZERO);
    balances.computeIfPresent(key, (accNo, prev) -> prev.add(op.getAmount()));
});


operations.forEach(op ->
        balances.merge(op.getAccNo(), op.getAmount(), 
                (soFar, amount) -> soFar.add(amount))
);


operations.forEach(op ->
        balances.merge(op.getAccNo(), op.getAmount(), BigDecimal::add)
);
I find this astoundingly readable. For each operation add given amount to given accNo. The results are as expected:

{123=9.5, 456=-100}
