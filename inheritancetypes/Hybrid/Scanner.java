package com.xworkz.tostring.Hybrid;

    interface Printer {
        void print();
    }

    class Scanner {
        void scan() {
            System.out.println("Scanning document");
        }

        class AllInOnePrinter extends Scanner implements Printer {
            public void print() {
                System.out.println("Printing document");
            }

            void fax() {
                System.out.println("Sending fax");
            }
        }
    }


