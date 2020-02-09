package info.bitrich.xchangestream.bitmex.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class BitmexOrder extends BitmexMarketDataEvent {
    private String orderID;
    private String clOrdID;
    private String clOrdLinkID;
    private Long account;
    private String side;
    private BigDecimal simpleOrderQty;
    private BigDecimal orderQty;
    private BigDecimal price;
    private BigDecimal displayQty;
    private BigDecimal stopPx;
    private BigDecimal pegOffsetValue;
    private String pegPriceType;
    private String currency;
    private String settlCurrency;
    private String ordType;
    private String timeInForce;
    private String execInst;
    private String contingencyType;
    private String exDestination;
    private String ordStatus;
    private String triggered;
    private boolean workingIndicator;
    private String ordRejReason;
    private BigDecimal simpleLeavesQty;
    private BigDecimal leavesQty;
    private BigDecimal simpleCumQty;
    private BigDecimal cumQty;
    private BigDecimal avgPx;
    private String multiLegReportingType;
    private String text;
    private String transactTime;

    @JsonCreator
    public BitmexOrder(
            @JsonProperty("orderID") String orderID,
            @JsonProperty("clOrdID") String clOrdID,
            @JsonProperty("clOrdLinkID") String clOrdLinkID,
            @JsonProperty("account") Long account,
            @JsonProperty("symbol") String symbol,
            @JsonProperty("side") String side,
            @JsonProperty("simpleOrderQty") BigDecimal simpleOrderQty,
            @JsonProperty("orderQty") BigDecimal orderQty,
            @JsonProperty("price") BigDecimal price,
            @JsonProperty("displayQty") BigDecimal displayQty,
            @JsonProperty("stopPx") BigDecimal stopPx,
            @JsonProperty("pegOffsetValue") BigDecimal pegOffsetValue,
            @JsonProperty("pegPriceType") String pegPriceType,
            @JsonProperty("currency") String currency,
            @JsonProperty("settlCurrency") String settlCurrency,
            @JsonProperty("ordType") String ordType,
            @JsonProperty("timeInForce") String timeInForce,
            @JsonProperty("execInst") String execInst,
            @JsonProperty("contingencyType") String contingencyType,
            @JsonProperty("exDestination") String exDestination,
            @JsonProperty("ordStatus") String ordStatus,
            @JsonProperty("triggered") String triggered,
            @JsonProperty("workingIndicator") boolean workingIndicator,
            @JsonProperty("ordRejReason") String ordRejReason,
            @JsonProperty("simpleLeavesQty") BigDecimal simpleLeavesQty,
            @JsonProperty("leavesQty") BigDecimal leavesQty,
            @JsonProperty("simpleCumQty") BigDecimal simpleCumQty,
            @JsonProperty("cumQty") BigDecimal cumQty,
            @JsonProperty("avgPx") BigDecimal avgPx,
            @JsonProperty("multiLegReportingType") String multiLegReportingType,
            @JsonProperty("text") String text,
            @JsonProperty("transactTime") String transactTime,
            @JsonProperty("timestamp") String timestamp) {
        super(symbol, timestamp);
        this.orderID = orderID;
        this.clOrdID = clOrdID;
        this.clOrdLinkID = clOrdLinkID;
        this.account = account;
        this.symbol = symbol;
        this.side = side;
        this.simpleOrderQty = simpleOrderQty;
        this.orderQty = orderQty;
        this.price = price;
        this.displayQty = displayQty;
        this.stopPx = stopPx;
        this.pegOffsetValue = pegOffsetValue;
        this.pegPriceType = pegPriceType;
        this.currency = currency;
        this.settlCurrency = settlCurrency;
        this.ordType = ordType;
        this.timeInForce = timeInForce;
        this.execInst = execInst;
        this.contingencyType = contingencyType;
        this.exDestination = exDestination;
        this.ordStatus = ordStatus;
        this.triggered = triggered;
        this.workingIndicator = workingIndicator;
        this.ordRejReason = ordRejReason;
        this.simpleLeavesQty = simpleLeavesQty;
        this.leavesQty = leavesQty;
        this.simpleCumQty = simpleCumQty;
        this.cumQty = cumQty;
        this.avgPx = avgPx;
        this.multiLegReportingType = multiLegReportingType;
        this.text = text;
        this.transactTime = transactTime;
    }

    public String getOrderID() {
        return orderID;
    }

    public String getClOrdID() {
        return clOrdID;
    }

    public String getClOrdLinkID() {
        return clOrdLinkID;
    }

    public Long getAccount() {
        return account;
    }

    public String getSide() {
        return side;
    }

    public BigDecimal getSimpleOrderQty() {
        return simpleOrderQty;
    }

    public BigDecimal getOrderQty() {
        return orderQty;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public BigDecimal getDisplayQty() {
        return displayQty;
    }

    public BigDecimal getStopPx() {
        return stopPx;
    }

    public BigDecimal getPegOffsetValue() {
        return pegOffsetValue;
    }

    public String getPegPriceType() {
        return pegPriceType;
    }

    public String getCurrency() {
        return currency;
    }

    public String getSettlCurrency() {
        return settlCurrency;
    }

    public String getOrdType() {
        return ordType;
    }

    public String getTimeInForce() {
        return timeInForce;
    }

    public String getExecInst() {
        return execInst;
    }

    public String getContingencyType() {
        return contingencyType;
    }

    public String getExDestination() {
        return exDestination;
    }

    public String getOrdStatus() {
        return ordStatus;
    }

    public String getTriggered() {
        return triggered;
    }

    public boolean isWorkingIndicator() {
        return workingIndicator;
    }

    public String getOrdRejReason() {
        return ordRejReason;
    }

    public BigDecimal getSimpleLeavesQty() {
        return simpleLeavesQty;
    }

    public BigDecimal getLeavesQty() {
        return leavesQty;
    }

    public BigDecimal getSimpleCumQty() {
        return simpleCumQty;
    }

    public BigDecimal getCumQty() {
        return cumQty;
    }

    public BigDecimal getAvgPx() {
        return avgPx;
    }

    public String getMultiLegReportingType() {
        return multiLegReportingType;
    }

    public String getText() {
        return text;
    }

    public String getTransactTime() {
        return transactTime;
    }
}
