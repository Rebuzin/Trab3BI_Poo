*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cafe;

/**
 *
 * @author renan
 */
public enum Enums {

    Small {
        @Override
        public double getCoffeSize() {
            return 1;
        }

    },
    Medium {
        @Override
        public double getCoffeSize() {
            return 1.20;
        }

    },
    Large {
        @Override
        public double getCoffeSize() {
            return 1.35;
        }

    };

    public abstract double getCoffeSize();

}
