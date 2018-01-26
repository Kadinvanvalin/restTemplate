package quote;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {

    private String quoteText;
    private String quoteAuthor;

    public Quote() {
    }

    public String getQuoteAuthor() {
        return quoteAuthor;
    }

    public void setQuoteAuthor(String quoteAuthor) {
        if (quoteAuthor.isEmpty()) {
            this.quoteAuthor = "Anonymous";
        } else {
            this.quoteAuthor = quoteAuthor;
        }
    }

    public String getQuoteText() {
        return quoteText;
    }

    public void setQuoteText(String quoteText) {
        this.quoteText = quoteText;
    }


    @Override
    public String toString() {
        return quoteText + "\n" + "-" + quoteAuthor;
    }
}
