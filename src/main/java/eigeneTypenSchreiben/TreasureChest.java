package eigeneTypenSchreiben;

public class TreasureChest {
    public final int goldDoubloonWeight;
    public final int gemstoneWeight;

    private TreasureChest(int goldDoubloonWeight, int gemstoneWeight){
        this.goldDoubloonWeight = goldDoubloonWeight;
        this.gemstoneWeight = gemstoneWeight;
    }
    public TreasureChest newInstance(){
        return new TreasureChest(0,0);
    }

    public TreasureChest newInstanceWithGoldDoubloonWeight(int goldDoubloonWeight){
        return new TreasureChest(goldDoubloonWeight, 0);
    }
    public TreasureChest newInstanceWithGemstoneWeight(int gemstoneWeight){
        return new TreasureChest(0, gemstoneWeight);
    }
    public TreasureChest newInstanceWithGoldDoubloonWeightAndGemstoneWeight(int goldDoubloonWeight, int gemstoneWeight){
        return new TreasureChest(goldDoubloonWeight, gemstoneWeight);
    }


}
