# primitive-operator

Clojure has an extensive system for dealing with numbers, including
error on overflow, or auto-promotion, defaulting to long and double
data types.

This is all well and good, but irritating if you need to implement an
algorithm which depends on ints overflowing for instance. While,
clojure provides functions for operating over ints, the names tend to
be long and wieldy, such as `clojure.core/unchecked-int-add`. Clojure
is also rather inconsistent; for example, the bit-shifting operators
in Java are not accessible in Clojure over ints.

This library provides accessible, easily named float and int functions
for Clojure. Where possible, functions with the same name as the
operators are provided as well as names (`<<` and `left-shift`). Three
Java operators are not valid symbols in clojure (`~`, `%` and `^`), so
just have names. Short reader literals are also provided to simplify
the creation of ints and float.

## Usage

(require '[primititve.operator.integer :as i])

(i/+ 10 10)
=> 20

(type (i/+ 10 10))
=> java.lang.Integer

(i/add 10 10)
=> 20

(i/not 10)
=> -11

(i/+ #p/i 10 #p/i 10)
=> 20

## License

Copyright © 2017 Phillip Lord

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
