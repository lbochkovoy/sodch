package objects;


import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Kusp {

    private String applicationForm;
    private String number;
    private String address;
    private String lastName;
    private String firstName;
    private String patronymic;
    private String phone;
    private Date   date;
    private String plot;

    private static String[] names = { "Иванов", "Петров", "Журавлев", "Попов", "Шатров", "Танеев", "Вырубов" };

    public static Kusp generateKusp()
    {
        Kusp result = new Kusp();
        Random generator = new Random();


        int index = generator.nextInt( names.length );
        String lastComplainantName = names[ index ];
        String plot = "Фабула";
        String applicationForm = "Заявление";

        result.setLastName( lastComplainantName );
        result.setPlot( plot );
        result.setApplicationForm( applicationForm );

        return result;
    }

    public Kusp ( )
    {
        this.applicationForm    = null;
        this.number             = null;
        this.address            = null;
        this.lastName           = null;
        this.firstName          = null;
        this.patronymic         = null;
        this.phone              = null;
        this.date               = null;
        this.plot               = null;
    }

    public void setNumber      ( String  newNumber     ) { this.number = newNumber;            }
    public void setNumber      ( Integer newNumber     ) { this.number = newNumber.toString(); }
    public void setAddress     ( String  newAddress    ) { this.address = newAddress;          }
    public void setLastName    ( String  newLastName   ) { this.lastName = newLastName;        }
    public void setFirstName   ( String  newFirstName  ) { this.firstName = newFirstName;      }
    public void setPatronymic  ( String  newPatronymic ) { this.patronymic = newPatronymic;    }
    public void setPhone       ( String  newPhone      ) { this.phone = newPhone;              }
    public void setDate        ( Date    newDate       ) { this.date = newDate;                }
    public void setPlot        ( String  newPlot       ) { this.plot = newPlot;                }

    public void setApplicationForm   ( String  newCrimeForm  ) { this.applicationForm = newCrimeForm;      }

    public String number            ( ) { return this.number;           }
    public String address           ( ) { return this.address;          }
    public String lastName          ( ) { return this.lastName;         }
    public String firstName         ( ) { return this.firstName;        }
    public String patronymic        ( ) { return this.patronymic;       }
    public String phone             ( ) { return this.phone;            }
    public Date   date              ( ) { return this.date;             }
    public String plot              ( ) { return this.plot;             }
    public String applicationForm   ( ) { return this.applicationForm;  }

    public Boolean hasNumber    ( ) { return ( this.number != null );   }

}
