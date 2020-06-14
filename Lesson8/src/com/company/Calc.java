package com.company;

public enum Calc {

    SUM ("+") {
        public  float action (float x, float y)  {
            return x +y;
        }

    },
    MULTIPLY ("*") {
        public  float action (float x, float y)  {
            return x *y;
        }

    },
    SUBTRACTION ("-")
            {
                public  float action (float x, float y)  {
                    return x -y;
                }

            },
    DIVISION ("/"){
        public  float action (float x, float y)  {
            return x /y;
        }

    };


    public abstract float action (float x, float y) ;

    private String sign;
    public String getSign () {
        return this.sign;

    }
    // констурктор в enum имеет модификатор доступа
    // private  и не может быть изменен
    Calc (String sign) {
        this.sign = sign;

    }

}

