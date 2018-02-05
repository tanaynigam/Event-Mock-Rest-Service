package hello;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.time.Instant;


@Entity
public class Event {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String name;
    private String description;
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    private Instant start;
    private String timezone;
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    private Instant end;
    private boolean hide_start_date;
    private boolean hide_end_date;
    private String currency;
    private String venue_id;
    private boolean online_event;
    private boolean listed;
    private String logo_id;
    private String category_id;
    private String subcategory_id;
    private String format_id;
    private boolean shareable;
    private boolean invite_only;
    private String password;
    private int capacity;
    private boolean show_remaining;
    private boolean is_reserved_seating;
    private String source;

    public Event() {
        name = "New Year blast";
        description = "The New Year After party";
        start = Instant.parse( "2018-03-03T13:14:28.000Z" );
        timezone = "America/Los_Angeles";
        end = Instant.parse( "2018-03-03T16:15:28.000Z" );
        hide_start_date = false;
        hide_end_date = false;
        currency = "USD";
        venue_id = "1222ASD";
        online_event = false;
        listed = true;
        logo_id = "27Absad";
        category_id = "127Absas";
        subcategory_id = "3287aBAhs";
        format_id = "ASvasd12";
        shareable = true;
        invite_only = true;
        password = "tanay";
        capacity = 21;
        show_remaining =true;
        is_reserved_seating = true;
        source ="Facebook";
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getStart() {
        return start.toString();
    }

    public String getTimezone() {
        return timezone;
    }

    public String getEnd() {
        return end.toString();
    }

    public boolean isHide_start_date() {
        return hide_start_date;
    }

    public boolean isHide_end_date() {
        return hide_end_date;
    }

    public String getCurrency() {
        return currency;
    }

    public String getVenue_id() {
        return venue_id;
    }

    public boolean isOnline_event() {
        return online_event;
    }

    public boolean isListed() {
        return listed;
    }

    public String getLogo_id() {
        return logo_id;
    }

    public String getCategory_id() {
        return category_id;
    }

    public String getSubcategory_id() {
        return subcategory_id;
    }

    public String getFormat_id() {
        return format_id;
    }

    public boolean isShareable() {
        return shareable;
    }

    public boolean isInvite_only() {
        return invite_only;
    }

    public String getPassword() {
        return password;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isShow_remaining() {
        return show_remaining;
    }

    public boolean isIs_reserved_seating() {
        return is_reserved_seating;
    }

    public String getSource() {
        return source;
    }
}