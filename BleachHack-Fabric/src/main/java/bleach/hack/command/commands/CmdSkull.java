package bleach.hack.command.commands;

import java.util.Base64;
import java.util.UUID;

import bleach.hack.command.Command;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.StringNbtReader;

public class CmdSkull extends Command {

	@Override
	public String getAlias() {
		return "skull";
	}

	@Override
	public String getDescription() {
		return "Gives you a player skull";
	}

	@Override
	public String getSyntax() {
		return ".skull [Player] | .skull img [Image url]";
	}

	@Override
	public void onCommand(String command, String[] args) throws Exception {
		ItemStack item = new ItemStack(Items.PLAYER_HEAD, 64);
		
		if(args.length < 2) {
			item.setTag(StringNbtReader.parse("{SkullOwner:{Name:\"" + args[0] + "\"}}"));
		}else if(args[0].equalsIgnoreCase("img")) {
			item.setTag(StringNbtReader.parse("{SkullOwner:{Id:\"" + UUID.randomUUID() + "\",Properties:{textures:[{Value:\""
					+ Base64.getEncoder().encodeToString(("{\"textures\":{\"SKIN\":{\"url\":\"" + args[1] + "\"}}}").getBytes())
					+ "\"}]}}}"));
		}
		System.out.println(mc.player.inventory.getMainHandStack().getTag());
		//bruh moment #2
		// thing i was doing don't mind it
		//String s = "{BlockEntityTag:{Items:[{Slot:0b,id:\"minecraft:white_shulker_box\",Count:1b,tag:{BlockEntityTag:{Items:[{Slot:0b,id:\"minecraft:player_head\",Count:1b,tag:{SkullOwner:{Id:\"d793ffc5-de25-32d1-bd14-2e323e26a6eb\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHBzOi8vZWR1Y2F0aW9uLm1pbmVjcmFmdC5uZXQvd3AtY29udGVudC91cGxvYWRzL3Bpbmd1LTUyOHg0NTAucG5nIn19fQ==\"}]}}}},{Slot:1b,id:\"minecraft:player_head\",Count:1b,tag:{SkullOwner:{Id:\"4143da35-6ef8-3817-926e-fd75421186ca\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHBzOi8vZWR1Y2F0aW9uLm1pbmVjcmFmdC5uZXQvd3AtY29udGVudC91cGxvYWRzL21vcmd6LnBuZyJ9fX0=\"}]}}}},{Slot:2b,id:\"minecraft:player_head\",Count:1b,tag:{SkullOwner:{Id:\"5fc0cf6f-d24d-3494-894a-23e6757a9ca6\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHBzOi8vZWR1Y2F0aW9uLm1pbmVjcmFmdC5uZXQvd3AtY29udGVudC91cGxvYWRzL293bzEucG5nIn19fQ==\"}]}}}},{Slot:3b,id:\"minecraft:player_head\",Count:1b,tag:{SkullOwner:{Id:\"4330f708-9f2e-30d6-bf32-93b24eea6604\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHBzOi8vZWR1Y2F0aW9uLm1pbmVjcmFmdC5uZXQvd3AtY29udGVudC91cGxvYWRzL2ZhZWZhZmVhZmFlZi01Mjh4NDUwLTUyOHg0NTAucG5nIn19fQ==\"}]}}}},{Slot:4b,id:\"minecraft:player_head\",Count:1b,tag:{SkullOwner:{Id:\"5e23c80d-0a2c-37db-8b35-f63462d17cef\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHBzOi8vZWR1Y2F0aW9uLm1pbmVjcmFmdC5uZXQvd3AtY29udGVudC91cGxvYWRzL2x1bGdvZC04MDB4NDUwLnBuZyJ9fX0=\"}]}},SkullOwnerOrig:\"d7b0fcf9-8417-48eb-a063-b782000db8c7\"}},{Slot:5b,id:\"minecraft:player_head\",Count:1b,tag:{SkullOwner:{Id:\"ec92d4c1-3db8-358b-b8ed-e67a08e6a008\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHBzOi8vZWR1Y2F0aW9uLm1pbmVjcmFmdC5uZXQvd3AtY29udGVudC91cGxvYWRzL3NhZGNhdC5wbmcifX19\"}]}},SkullOwnerOrig:\"4a02f936-e316-45bc-8222-391ffb244e39\"}},{Slot:6b,id:\"minecraft:player_head\",Count:1b,tag:{SkullOwner:{Id:\"e288e748-b067-3746-9672-4410ad53aa40\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHBzOi8vZWR1Y2F0aW9uLm1pbmVjcmFmdC5uZXQvd3AtY29udGVudC91cGxvYWRzL3Rlc3RhaXJnZy5wbmcifX19\"}]}},display:{Lore:['{\"text\":\"{\\\\\"text\\\\\":\\\\\"{\\\\\\\\\\\\\"text\\\\\\\\\\\\\":\\\\\\\\\\\\\"{\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"text\\\\\\\\\\\\\\\\\\\\\\\\\\\\\":\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"§cHearing -5\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"}\\\\\\\\\\\\\"}\\\\\"}\"}'],Name:'{\"text\":\"{\\\\\"text\\\\\":\\\\\"§f§lAirpods\\\\\"}\"}'},Enchantments:[{lvl:5s,id:\"minecraft:unbreaking\"}],SkullOwnerOrig:\"1f7aeb63-b492-4841-b4cb-d1b1cf06c0d0\"}}],id:\"minecraft:shulker_box\"},display:{Lore:['{\"text\":\"(+NBT)\"}']}}},{Slot:1b,id:\"minecraft:white_shulker_box\",Count:1b,tag:{BlockEntityTag:{CustomName:'{\"text\":\"{\\\\\"text\\\\\":\\\\\"1.13 HD heads\\\\\"}\"}',Items:[{Slot:0b,id:\"minecraft:player_head\",Count:1b,tag:{SkullOwner:{Id:\"374d6164-6520-6279-2052-756e61696963\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHBzOi8vZWR1Y2F0aW9uLm1pbmVjcmFmdC5uZXQvd3AtY29udGVudC91cGxvYWRzL3JlZWRvdC5wbmcifX19\"}]},Name:\"Reddit\"}}},{Slot:1b,id:\"minecraft:player_head\",Count:1b,tag:{SkullOwner:{Id:\"3e1136e8-5987-38d1-9e3f-ed0a7b03b911\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHBzOi8vZWR1Y2F0aW9uLm1pbmVjcmFmdC5uZXQvd3AtY29udGVudC91cGxvYWRzL0hlYWQtQkQtRHZhLnBuZyJ9fX0=\"}]},Name:\"Belle Delphine\"},SkullOwnerOrig:\"3e1136e8-5987-38d1-9e3f-ed0a7b03b911\"}},{Slot:2b,id:\"minecraft:player_head\",Count:1b,tag:{SkullOwner:{Id:\"0e32862e-57a0-360c-b469-48143d667bee\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHBzOi8vZWR1Y2F0aW9uLm1pbmVjcmFmdC5uZXQvd3AtY29udGVudC91cGxvYWRzL0hlYWQtUERQLVN1Yi5wbmcifX19\"}]},Name:\"Subscribe to PewDiePie\"},SkullOwnerOrig:\"0e32862e-57a0-360c-b469-48143d667bee\"}},{Slot:3b,id:\"minecraft:player_head\",Count:1b,tag:{SkullOwner:{Id:\"78bcdaf1-9f5b-32ee-bebf-2966c2dedda1\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHBzOi8vZWR1Y2F0aW9uLm1pbmVjcmFmdC5uZXQvd3AtY29udGVudC91cGxvYWRzL2JpYmxlcnVsZWhhc2FoZWFkbm93LnBuZyJ9fX0=\"}]},Name:\"BibleRule\"}}},{Slot:4b,id:\"minecraft:player_head\",Count:1b,tag:{SkullOwner:{Id:\"52d8a57b-03b3-3cfa-a69e-eaa777ded0c2\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHBzOi8vZWR1Y2F0aW9uLm1pbmVjcmFmdC5uZXQvd3AtY29udGVudC91cGxvYWRzL2JsYWNrZHVkZWhlYWQucG5nIn19fQ==\"}]},Name:\"Black Dude\"}}},{Slot:5b,id:\"minecraft:player_head\",Count:1b,tag:{SkullOwner:{Id:\"384d6164-6520-6279-2052-756e61696963\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHBzOi8vZWR1Y2F0aW9uLm1pbmVjcmFmdC5uZXQvd3AtY29udGVudC91cGxvYWRzL2RlZXpjb3JkLnBuZyJ9fX0=\"}]}}}},{Slot:6b,id:\"minecraft:player_head\",Count:1b,tag:{SkullOwner:{Id:\"354d6164-6520-6279-2052-756e61696963\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHBzOi8vZWR1Y2F0aW9uLm1pbmVjcmFmdC5uZXQvd3AtY29udGVudC91cGxvYWRzL25peGlldHViZS5wbmcifX19\"}]},Name:\"YouTube\"}}},{Slot:7b,id:\"minecraft:player_head\",Count:1b,tag:{SkullOwner:{Id:\"2c133ddf-9f0a-48fd-80d6-904b8e67f729\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHBzOi8vZWR1Y2F0aW9uLm1pbmVjcmFmdC5uZXQvd3AtY29udGVudC91cGxvYWRzL21pbmVjcmFmdC1oZWFkLXNwYWdoZXQucG5nIn19fQ==\"}]},Name:\"Spagggggettttttti\"}}},{Slot:8b,id:\"minecraft:player_head\",Count:1b,tag:{SkullOwner:{Id:\"324d6164-6520-6279-2052-756e61696963\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHBzOi8vZWR1Y2F0aW9uLm1pbmVjcmFmdC5uZXQvd3AtY29udGVudC91cGxvYWRzL2luc3Rha2lsb2dyYW0ucG5nIn19fQ==\"}]},Name:\"Instagram\"}}},{Slot:9b,id:\"minecraft:player_head\",Count:1b,tag:{SkullOwner:{Id:\"ba2dae0a-c100-35bb-b007-43551c8b12d3\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHBzOi8vZWR1Y2F0aW9uLm1pbmVjcmFmdC5uZXQvd3AtY29udGVudC91cGxvYWRzL2thc3RlZWxfODAweDQ1MF9maW5hbC5wbmcifX19\"}]},Name:\"Kasteel Rouge\"}}},{Slot:10b,id:\"minecraft:player_head\",Count:1b,tag:{SkullOwner:{Id:\"359d3371-1dbe-30a9-a2db-bbacccf1de9f\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHBzOi8vZWR1Y2F0aW9uLm1pbmVjcmFmdC5uZXQvd3AtY29udGVudC91cGxvYWRzL3NldGhzaGVhZDEucG5nIn19fQ==\"}]},Name:\"Sethwantsahead\"}}},{Slot:11b,id:\"minecraft:player_head\",Count:1b,tag:{SkullOwner:{Id:\"5fe2f206-2640-3c55-88f1-d670dcb69095\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHBzOi8vZWR1Y2F0aW9uLm1pbmVjcmFmdC5uZXQvd3AtY29udGVudC91cGxvYWRzL3R3YXR0ZXIucG5nIn19fQ==\"}]},Name:\"Twitter\"}}},{Slot:12b,id:\"minecraft:player_head\",Count:1b,tag:{SkullOwner:{Id:\"0f801cc9-5eb6-3e01-be45-e732297d69e9\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHBzOi8vZWR1Y2F0aW9uLm1pbmVjcmFmdC5uZXQvd3AtY29udGVudC91cGxvYWRzL3ByaXZhY3lpbnZhZGVyLnBuZyJ9fX0=\"}]}}}},{Slot:13b,id:\"minecraft:player_head\",Count:1b,tag:{SkullOwner:{Id:\"7bc33928-5890-39f7-a6a8-96b50d7c85f5\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHBzOi8vZWR1Y2F0aW9uLm1pbmVjcmFmdC5uZXQvd3AtY29udGVudC91cGxvYWRzL2RlZXpjb3JkLnBuZyJ9fX0=\"}]},Name:\"Discord\"}}},{Slot:14b,id:\"minecraft:player_head\",Count:1b,tag:{SkullOwner:{Id:\"c0234eb4-8d25-37f3-99c1-c9f130d6f943\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHBzOi8vZWR1Y2F0aW9uLm1pbmVjcmFmdC5uZXQvd3AtY29udGVudC91cGxvYWRzL2luc3Rha2lsb2dyYW0ucG5nIn19fQ==\"}]}}}},{Slot:15b,id:\"minecraft:player_head\",Count:1b,tag:{SkullOwner:{Id:\"ff493607-2c60-30fb-91a7-570cd31d45d8\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHBzOi8vZWR1Y2F0aW9uLm1pbmVjcmFmdC5uZXQvd3AtY29udGVudC91cGxvYWRzL3NuYXBjaGF0LnBuZyJ9fX0=\"}]}}}},{Slot:16b,id:\"minecraft:player_head\",Count:1b,tag:{SkullOwner:{Id:\"d1372121-c593-32e7-b9a2-66cd42fe5bd4\",Properties:{textures:[{Value:\"e3RleHR1cmVzOntTS0lOOnt1cmw6Imh0dHBzOi8vZWR1Y2F0aW9uLm1pbmVjcmFmdC5uZXQvd3AtY29udGVudC91cGxvYWRzL0hpZ2gtcmVzb2x1dGlvbi1waW5rLWFuaW1lLWhhaXJlZC1naXJsLnBuZyJ9fX0=\"}]}}}},{Slot:17b,id:\"minecraft:player_head\",Count:1b,tag:{SkullOwner:{Id:\"2cf7a808-62e1-39b8-b746-5707b8d20134\",Properties:{textures:[{Value:\"e3RleHR1cmVzOntTS0lOOnt1cmw6Imh0dHBzOi8vZWR1Y2F0aW9uLm1pbmVjcmFmdC5uZXQvd3AtY29udGVudC91cGxvYWRzL0hpZ2gtcmVzb2x1dGlvbi1ib29rLnBuZyJ9fX0=\"}]}}}},{Slot:18b,id:\"minecraft:player_head\",Count:1b,tag:{SkullOwner:{Id:\"7f2c76bb-2e64-3f87-a381-a85df96b18e0\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHBzOi8vZWR1Y2F0aW9uLm1pbmVjcmFmdC5uZXQvd3AtY29udGVudC91cGxvYWRzLzMtMTQucG5nIn19fQ==\"}]},Name:\"Girl in sun1\"}}},{Slot:19b,id:\"minecraft:player_head\",Count:1b,tag:{SkullOwner:{Id:\"04f992ac-60ab-30cb-a13f-549390f606ad\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHBzOi8vZWR1Y2F0aW9uLm1pbmVjcmFmdC5uZXQvd3AtY29udGVudC91cGxvYWRzL2RlZmF1bHRkYW5jZS5wbmcifX19\"}]}}}},{Slot:20b,id:\"minecraft:player_head\",Count:1b,tag:{SkullOwner:{Id:\"462171f8-eb54-3ac3-9f03-2f90ecd608b8\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHBzOi8vZWR1Y2F0aW9uLm1pbmVjcmFmdC5uZXQvd3AtY29udGVudC91cGxvYWRzL0hlYWQtUERQLVBhdHRlcm4tMS5wbmcifX19\"}]},Name:\"Subscribe to PewDiePie\"}}},{Slot:21b,id:\"minecraft:player_head\",Count:1b,tag:{SkullOwner:{Id:\"614d6164-6520-6279-2052-756e61696963\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHBzOi8vZWR1Y2F0aW9uLm1pbmVjcmFmdC5uZXQvd3AtY29udGVudC91cGxvYWRzL3N1bmdsYXNzZXMyLnBuZyJ9fX0=\"}]},Name:\"Sunglasses is Runaiic\"}}},{Slot:22b,id:\"minecraft:player_head\",Count:1b,tag:{SkullOwner:{Id:\"43f2a76e-471c-4c91-80bb-d8c4c4b6e966\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHBzOi8vZWR1Y2F0aW9uLm1pbmVjcmFmdC5uZXQvd3AtY29udGVudC91cGxvYWRzL3Bpb25lZXJfY2VudGVyXzgwMHg0NTBfZmluYWwucG5nIn19fQ==\"}]}},display:{Name:'{\"text\":\"{\\\\\"text\\\\\":\\\\\"Pioneer Console\\\\\"}\"}'}}},{Slot:23b,id:\"minecraft:player_head\",Count:1b,tag:{SkullOwner:{Id:\"43f2a76e-471c-4bb1-80bb-d8c4c4b6e966\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHBzOi8vZWR1Y2F0aW9uLm1pbmVjcmFmdC5uZXQvd3AtY29udGVudC91cGxvYWRzL3Bpb25lZXJfY2RqXzgwMHg0NTBfZmluYWwucG5nIn19fQ==\"}]}},display:{Name:'{\"text\":\"{\\\\\"text\\\\\":\\\\\"Pioneer CDJ\\\\\"}\"}'}}},{Slot:24b,id:\"minecraft:player_head\",Count:1b,tag:{SkullOwner:{Id:\"43f2a76d-046c-4cb1-30db-d3c4c4b6e900\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHBzOi8vZWR1Y2F0aW9uLm1pbmVjcmFmdC5uZXQvd3AtY29udGVudC91cGxvYWRzL3JhaW5ib3dfODAweDQ1MF9maW5hbC5wbmcifX19\"}]},Name:\"Rainbow by M-Seven\"},display:{Name:'{\"text\":\"{\\\\\"text\\\\\":\\\\\"HD Rainbow\\\\\"}\"}'}}},{Slot:25b,id:\"minecraft:player_head\",Count:1b,tag:{SkullOwner:{Id:\"43f2e76e-481c-6c91-80b9-d8c4c4b6e866\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHBzOi8vZWR1Y2F0aW9uLm1pbmVjcmFmdC5uZXQvd3AtY29udGVudC91cGxvYWRzL21ham9yYXNtYXNrXzgwMHg0NTBfZmluYWwucG5nIn19fQ==\"}]},Name:\"Majora's Mask\"},display:{Name:'{\"text\":\"{\\\\\"bold\\\\\":true,\\\\\"italic\\\\\":false,\\\\\"color\\\\\":\\\\\"dark_purple\\\\\",\\\\\"text\\\\\":\\\\\"Majora\\\\\\\\u0027s Mask\\\\\"}\"}'}}},{Slot:26b,id:\"minecraft:player_head\",Count:1b,tag:{SkullOwner:{Id:\"43f2a76d-049c-4cb1-30db-d3c4c4b6e900\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHBzOi8vZWR1Y2F0aW9uLm1pbmVjcmFmdC5uZXQvd3AtY29udGVudC91cGxvYWRzL2Jvc3NrZXlfODAweDQ1MF9maW5hbC5wbmcifX19\"}]},Name:\"Boss Key by M-Seven\"},display:{Name:'{\"text\":\"{\\\\\"text\\\\\":\\\\\"Key\\\\\"}\"}'}}}],id:\"minecraft:shulker_box\"},display:{Lore:['{\"text\":\"(+NBT)\"}']}}},{Slot:2b,id:\"minecraft:white_shulker_box\",Count:1b,tag:{BlockEntityTag:{Items:[{Slot:0b,id:\"minecraft:player_head\",Count:1b,tag:{SkullOwner:{Id:\"43f2a76e-471c-4bb1-80bb-d8c4c4b6e900\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHBzOi8vZWR1Y2F0aW9uLm1pbmVjcmFmdC5uZXQvd3AtY29udGVudC91cGxvYWRzL20tc2V2ZW4tbG9nb184MDB4NDUwX2ZpbmFsLnBuZyJ9fX0=\"}]}},display:{Name:'{\"text\":\"{\\\\\"text\\\\\":\\\\\"M-Seven Logo\\\\\"}\"}'}}},{Slot:1b,id:\"minecraft:player_head\",Count:1b,tag:{SkullOwner:{Id:\"43f2a76e-471c-4bb1-80bb-d3c4c4b6e900\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHBzOi8vZWR1Y2F0aW9uLm1pbmVjcmFmdC5uZXQvd3AtY29udGVudC91cGxvYWRzL29kb2x3YV9yZW1haW5zXzgwMHg0NTBfZmluYWwucG5nIn19fQ==\"}]}},display:{Name:'{\"text\":\"{\\\\\"text\\\\\":\\\\\"Odolwa\\\\\\\\u0027s Remains\\\\\"}\"}'}}},{Slot:2b,id:\"minecraft:player_head\",Count:1b,tag:{SkullOwner:{Id:\"624d6164-6520-6279-2052-756e61696963\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHBzOi8vZWR1Y2F0aW9uLm1pbmVjcmFmdC5uZXQvd3AtY29udGVudC91cGxvYWRzLzNER0xBU1NFUy5wbmcifX19\"}]},Name:\"3D Glasses is Runaiic\"}}},{Slot:3b,id:\"minecraft:player_head\",Count:1b,tag:{SkullOwner:{Id:\"243e2431-4322-3279-2452-736d21696963\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHBzOi8vZWR1Y2F0aW9uLm1pbmVjcmFmdC5uZXQvd3AtY29udGVudC91cGxvYWRzL1NTbWlsZS5wbmcifX19\"}]},Name:\"SSmile\"}}},{Slot:4b,id:\"minecraft:player_head\",Count:1b,tag:{SkullOwner:{Id:\"234e2411-4992-3279-2452-736d21696963\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHBzOi8vZWR1Y2F0aW9uLm1pbmVjcmFmdC5uZXQvd3AtY29udGVudC91cGxvYWRzL1NrdWxsLnBuZyJ9fX0=\"}]},Name:\"SSkull\"}}},{Slot:5b,id:\"minecraft:player_head\",Count:1b,tag:{SkullOwner:{Id:\"321a5234-6510-6279-2452-736d21696963\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHBzOi8vZWR1Y2F0aW9uLm1pbmVjcmFmdC5uZXQvd3AtY29udGVudC91cGxvYWRzL1Rlc3RUZXN0LnBuZyJ9fX0=\"}]},Name:\"TTestc\"}}},{Slot:6b,id:\"minecraft:player_head\",Count:1b,tag:{SkullOwner:{Id:\"5230285b-db8e-4c17-9275-86241e8c6008\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHBzOi8vZWR1Y2F0aW9uLm1pbmVjcmFmdC5uZXQvd3AtY29udGVudC91cGxvYWRzL3NzLTU1MHg0NTAucG5nIn19fQ==\"}]}}}},{Slot:7b,id:\"minecraft:player_head\",Count:1b,tag:{SkullOwner:{Id:\"30260610-e56b-4270-b3ce-cb9d7f06e833\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHBzOi8vZWR1Y2F0aW9uLm1pbmVjcmFmdC5uZXQvd3AtY29udGVudC91cGxvYWRzL2dpaGFpb2ZoYS02NTB4NDUwLnBuZyJ9fX0=\"}]}}}},{Slot:8b,id:\"minecraft:player_head\",Count:1b,tag:{SkullOwner:{Id:\"37b3a564-6ae6-4938-a353-780a1600a239\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHBzOi8vZWR1Y2F0aW9uLm1pbmVjcmFmdC5uZXQvd3AtY29udGVudC91cGxvYWRzL2FkYWRhZGRhLTY1MHg0NTAucG5nIn19fQ==\"}]}}}},{Slot:9b,id:\"minecraft:player_head\",Count:1b,tag:{SkullOwner:{Id:\"96f74291-f9ba-455c-8bcb-48f1d5412676\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHBzOi8vZWR1Y2F0aW9uLm1pbmVjcmFmdC5uZXQvd3AtY29udGVudC91cGxvYWRzL3Nzc3Nzc3Nzc3MtNTI4eDQ1MC5wbmcifX19\"}]}}}},{Slot:10b,id:\"minecraft:player_head\",Count:1b,tag:{SkullOwner:{Id:\"2db2c4db-f5a1-4d8a-a924-1f3fb222f180\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHBzOi8vZWR1Y2F0aW9uLm1pbmVjcmFmdC5uZXQvd3AtY29udGVudC91cGxvYWRzL2dnZ2dnZ2dnZ2dnZy01Mjh4NDUwLnBuZyJ9fX0=\"}]}}}},{Slot:11b,id:\"minecraft:player_head\",Count:1b,tag:{SkullOwner:{Id:\"2ceeff6e-520d-3359-89a7-c56a89783fec\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHBzOi8vZWR1Y2F0aW9uLm1pbmVjcmFmdC5uZXQvd3AtY29udGVudC91cGxvYWRzL3d1ZGRhcC0xLnBuZyJ9fX0=\"}]},Name:\"WhatsApp\"}}},{Slot:12b,id:\"minecraft:player_head\",Count:1b,tag:{SkullOwner:{Id:\"99d84729-eb36-3809-b49b-db07454fd299\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHBzOi8vZWR1Y2F0aW9uLm1pbmVjcmFmdC5uZXQvd3AtY29udGVudC91cGxvYWRzL0tleWJvYXJkMi0xLnBuZyJ9fX0=\"}]}}}},{Slot:13b,id:\"minecraft:player_head\",Count:1b,tag:{SkullOwner:{Id:\"ebe6789e-6690-45f3-9189-f65540f5b1c8\",Properties:{textures:[{Value:\"e3RleHR1cmVzOntTS0lOOnt1cmw6Imh0dHBzOi8vZWR1Y2F0aW9uLm1pbmVjcmFmdC5uZXQvd3AtY29udGVudC91cGxvYWRzL0hvcnJvci13aXRjaC5wbmcifX19\"}]}}}},{Slot:14b,id:\"minecraft:player_head\",Count:1b,tag:{SkullOwner:{Id:\"6eeebaa0-9c0b-3ce1-9532-75ccc9ee9c61\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHBzOi8vZWR1Y2F0aW9uLm1pbmVjcmFmdC5uZXQvd3AtY29udGVudC91cGxvYWRzL3Bld2RpZXBpZS5wbmcifX19\"}]}}}},{Slot:15b,id:\"minecraft:player_head\",Count:1b,tag:{SkullOwner:{Id:\"df59b980-c5d8-4ce0-9f9f-0bebb87a10e6\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHBzOi8vZWR1Y2F0aW9uLm1pbmVjcmFmdC5uZXQvd3AtY29udGVudC91cGxvYWRzL29rd3V0bGwucG5nIn19fQ==\"}]}}}},{Slot:16b,id:\"minecraft:player_head\",Count:1b,tag:{SkullOwner:{Id:\"37d60128-aad9-4b53-9e17-c6e75df50030\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHBzOi8vZWR1Y2F0aW9uLm1pbmVjcmFmdC5uZXQvd3AtY29udGVudC91cGxvYWRzL2tra2tra2trLnBuZyJ9fX0=\"}]}}}},{Slot:17b,id:\"minecraft:player_head\",Count:1b,tag:{SkullOwner:{Id:\"0510acc5-8e9d-4038-995b-4ccd572ba0e9\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHBzOi8vZWR1Y2F0aW9uLm1pbmVjcmFmdC5uZXQvd3AtY29udGVudC91cGxvYWRzL3BlcGVvbWcucG5nIn19fQ==\"}]}}}},{Slot:18b,id:\"minecraft:player_head\",Count:1b,tag:{SkullOwner:{Id:\"c888511d-d3ae-476c-8008-2b53b608527e\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHBzOi8vZWR1Y2F0aW9uLm1pbmVjcmFmdC5uZXQvd3AtY29udGVudC91cGxvYWRzL21pbGsucG5nIn19fQ==\"}]}}}},{Slot:19b,id:\"minecraft:player_head\",Count:1b,tag:{SkullOwner:{Id:\"0ac033b2-727f-330e-8e30-b07d789c457c\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHBzOi8vZWR1Y2F0aW9uLm1pbmVjcmFmdC5uZXQvd3AtY29udGVudC91cGxvYWRzL2VtZXJhbGQtYXJtb3ItdHJ5LTIucG5nIn19fQ==\"}]},Name:\"Emerald helmet\"}}},{Slot:20b,id:\"minecraft:player_head\",Count:1b,tag:{SkullOwner:{Id:\"d4495973-cab4-3562-9d42-1c33332449df\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHBzOi8vZWR1Y2F0aW9uLm1pbmVjcmFmdC5uZXQvd3AtY29udGVudC91cGxvYWRzL3RoaW5raW5nLnBuZyJ9fX0=\"}]},Name:\"thinking\"}}},{Slot:21b,id:\"minecraft:player_head\",Count:1b,tag:{SkullOwner:{Id:\"008f715d-d9f5-485f-917a-27f93249a0dc\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHBzOi8vZWR1Y2F0aW9uLm1pbmVjcmFmdC5uZXQvd3AtY29udGVudC91cGxvYWRzLzJCLUhFQUQucG5nIn19fQ==\"}]},Name:\"2b head by meet\"}}},{Slot:22b,id:\"minecraft:player_head\",Count:1b,tag:{SkullOwner:{Id:\"25926666-53b4-35ee-9581-a09dd598107d\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHBzOi8vZWR1Y2F0aW9uLm1pbmVjcmFmdC5uZXQvd3AtY29udGVudC91cGxvYWRzL29rZXNzc3Nzcy5wbmcifX19\"}]}}}},{Slot:23b,id:\"minecraft:player_head\",Count:1b,tag:{SkullOwner:{Id:\"d7a3b551-c435-37b3-b8f5-c28d1c0f2bb2\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHBzOi8vZWR1Y2F0aW9uLm1pbmVjcmFmdC5uZXQvd3AtY29udGVudC91cGxvYWRzL3Rlc3QyLTUyOHg0NTAucG5nIn19fQ==\"}]}}}},{Slot:24b,id:\"minecraft:player_head\",Count:1b,tag:{SkullOwner:{Id:\"9fdfd39a-fde9-3a84-b4ee-bbc60536e1a4\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHBzOi8vZWR1Y2F0aW9uLm1pbmVjcmFmdC5uZXQvd3AtY29udGVudC91cGxvYWRzLzF1bHRpbWF0aHVsZTIyMjIyLnBuZyJ9fX0=\"}]}}}},{Slot:25b,id:\"minecraft:player_head\",Count:1b,tag:{SkullOwner:{Id:\"27b16659-9e5f-3730-87f8-6917441ff5f1\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHBzOi8vZWR1Y2F0aW9uLm1pbmVjcmFmdC5uZXQvd3AtY29udGVudC91cGxvYWRzLzExMTFvbWd3YXR1aG1vay5wbmcifX19\"}]}}}},{Slot:26b,id:\"minecraft:player_head\",Count:1b,tag:{SkullOwner:{Id:\"fcdd51a6-7b79-3197-8d17-0c21ee86b39f\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHBzOi8vZWR1Y2F0aW9uLm1pbmVjcmFmdC5uZXQvd3AtY29udGVudC91cGxvYWRzL2dnZ2dnZ2ctNTI4eDQ1MC5wbmcifX19\"}]}}}}],id:\"minecraft:shulker_box\"},display:{Lore:['{\"text\":\"(+NBT)\"}']}}}],id:\"minecraft:chest\"},display:{Lore:['{\"text\":\"(+NBT)\"}']}}";
		
		mc.player.inventory.addPickBlock(item);
	}

}