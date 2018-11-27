# dice
----

dice.clj is a regex function for dungeons and dragons style dice notation.



                    ______
        .-------.  /\     \
       /   o   /| /o \  o  \
      /_______/o|/   o\_____\
      | o     | |\o   /o    /
      |   o   |o/ \ o/  o  /
      |     o |/   \/____o/
      '-------'


------------------

## Usage

The dice roller should work according to the accustomed dice-roller notation:

`roll X d Y options`

  * `k n` - Advantage, keep the n highest rolls (default 1).
  * `kl n`- Disadvantage, keep the n lowest rolls (default 1).
  * `r i` - Reroll the number indicated -- applies only to the attached roll.
  * `+-/x i` - Arithmetic operator for the number indicated, applies in order placed.
  
  

## License

Copyright © 2018 Brendan Reddy-Best

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
