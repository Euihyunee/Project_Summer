package testing.testDB.Repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import testing.testDB.domain.Matchid;

@SpringBootTest
public class MatchRepositoryCreate {

    @Autowired
    MatchRepository matchRepository;

    @Test
    public void InsertFullRecord() {
        Matchid matchid = Matchid.builder()
                .matchID("KR_6008092812")
                .json("{\n" +
                        "  \"fullRecordDTOs\": [\n" +
                        "    {\n" +
                        "      \"game_length\": 2292.4739,\n" +
                        "      \"match_id\": \"KR_6008092812\",\n" +
                        "      \"participantsPuuid\": [\n" +
                        "        \"_OTF81a4nFJXvivCNtUL01skGoY0VaAoj7AsRzQNUpThZ0bieMLyDDJOryvSetjSnDVdKtMEtWAYoQ\",\n" +
                        "        \"uxPoCWPmYUWzNXA-92O9hLVXFfhSxI5GurZmX_nYx4Jc5dGru9LoEpqeY0XO3cYVIFXr65lKuo0tRw\",\n" +
                        "        \"5xks6-mhANZ4ZdHalJLzGmM3LFfvIJNNkLs5ZlilUSVjTf-FbIp04B3VRFhyyNpHDeUqgfmHZ4w0DA\",\n" +
                        "        \"SORED-yCCCQ5sVhg9zzrACR-8xMxdRn29v8JI3rKKtWLpRTaO3jmindC9U1mfWzAvu-4qBJduQTEwQ\",\n" +
                        "        \"5CdlPBy6ZVPqfgblWKr8xRFS308eTop8LmthsoloJo_Py4kaiALelXJ1VCKShvegXZimiUgSM7UABQ\",\n" +
                        "        \"o0lzSNv1FZRtm012qfoq-o3KrXcMVYAFaQ4rTStHkBTYdJOiSeMsFwIOH3C2PcclSHR-RgRRtwYODw\",\n" +
                        "        \"JyvINRuFNzBXc0bXx3kwK_LizyirwKJq_uik_SuY564YIVSSkcNMcsZIWSQuhWwwsBlyc4DtA9uLqA\",\n" +
                        "        \"6SOk7lrv-igHylS_bVQu6vrVr6J1SCTT45U8FEGgvdw1TYG3j4WuKgFMyKoOex6u9v5z7ijrI3Y8bQ\"\n" +
                        "      ],\n" +
                        "      \"participants\": [\n" +
                        "        {\n" +
                        "          \"augments\": [\n" +
                        "            \"TFT6_Augment_RichGetRicher\",\n" +
                        "            \"TFT7_Augment_SwiftshotPressTheAttack\",\n" +
                        "            \"TFT6_Augment_Ascension\"\n" +
                        "          ],\n" +
                        "          \"companion\": {\n" +
                        "            \"content_ID\": \"2fc3a4c0-7322-4ef5-b434-0cea1d1997e6\",\n" +
                        "            \"skin_ID\": 1,\n" +
                        "            \"species\": \"PetChibiJinx\"\n" +
                        "          },\n" +
                        "          \"gold_left\": 1,\n" +
                        "          \"last_round\": 24,\n" +
                        "          \"level\": 7,\n" +
                        "          \"placement\": 8,\n" +
                        "          \"time_eliminated\": 1449.0519,\n" +
                        "          \"traits\": [\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Astral\",\n" +
                        "              \"num_units\": 3,\n" +
                        "              \"style\": 1,\n" +
                        "              \"tier_current\": 1,\n" +
                        "              \"tier_total\": 3\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Bard\",\n" +
                        "              \"num_units\": 1,\n" +
                        "              \"style\": 3,\n" +
                        "              \"tier_current\": 1,\n" +
                        "              \"tier_total\": 1\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Bruiser\",\n" +
                        "              \"num_units\": 4,\n" +
                        "              \"style\": 2,\n" +
                        "              \"tier_current\": 2,\n" +
                        "              \"tier_total\": 4\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Guild\",\n" +
                        "              \"num_units\": 2,\n" +
                        "              \"style\": 1,\n" +
                        "              \"tier_current\": 2,\n" +
                        "              \"tier_total\": 6\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Legend\",\n" +
                        "              \"num_units\": 1,\n" +
                        "              \"style\": 0,\n" +
                        "              \"tier_current\": 0,\n" +
                        "              \"tier_total\": 1\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Mystic\",\n" +
                        "              \"num_units\": 1,\n" +
                        "              \"style\": 0,\n" +
                        "              \"tier_current\": 0,\n" +
                        "              \"tier_total\": 4\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Ragewing\",\n" +
                        "              \"num_units\": 1,\n" +
                        "              \"style\": 0,\n" +
                        "              \"tier_current\": 0,\n" +
                        "              \"tier_total\": 3\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Swiftshot\",\n" +
                        "              \"num_units\": 2,\n" +
                        "              \"style\": 1,\n" +
                        "              \"tier_current\": 1,\n" +
                        "              \"tier_total\": 3\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Tempest\",\n" +
                        "              \"num_units\": 1,\n" +
                        "              \"style\": 0,\n" +
                        "              \"tier_current\": 0,\n" +
                        "              \"tier_total\": 4\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Warrior\",\n" +
                        "              \"num_units\": 1,\n" +
                        "              \"style\": 0,\n" +
                        "              \"tier_current\": 0,\n" +
                        "              \"tier_total\": 3\n" +
                        "            }\n" +
                        "          ],\n" +
                        "          \"units\": [\n" +
                        "            {\n" +
                        "              \"items\": [\n" +
                        "                35\n" +
                        "              ],\n" +
                        "              \"character_id\": \"TFT7_Skarner\",\n" +
                        "              \"itemNames\": [\n" +
                        "                \"TFT_Item_LocketOfTheIronSolari\"\n" +
                        "              ],\n" +
                        "              \"rarity\": 0,\n" +
                        "              \"tier\": 2\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"items\": [],\n" +
                        "              \"character_id\": \"TFT7_Shen\",\n" +
                        "              \"itemNames\": [],\n" +
                        "              \"rarity\": 1,\n" +
                        "              \"tier\": 2\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"items\": [],\n" +
                        "              \"character_id\": \"TFT7_Twitch\",\n" +
                        "              \"itemNames\": [],\n" +
                        "              \"rarity\": 1,\n" +
                        "              \"tier\": 2\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"items\": [\n" +
                        "                11,\n" +
                        "                23\n" +
                        "              ],\n" +
                        "              \"character_id\": \"TFT7_Varus\",\n" +
                        "              \"itemNames\": [\n" +
                        "                \"TFT_Item_Deathblade\",\n" +
                        "                \"TFT_Item_GuinsoosRageblade\"\n" +
                        "              ],\n" +
                        "              \"rarity\": 2,\n" +
                        "              \"tier\": 2\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"items\": [\n" +
                        "                77\n" +
                        "              ],\n" +
                        "              \"character_id\": \"TFT7_Illaoi\",\n" +
                        "              \"itemNames\": [\n" +
                        "                \"TFT_Item_WarmogsArmor\"\n" +
                        "              ],\n" +
                        "              \"rarity\": 2,\n" +
                        "              \"tier\": 2\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"items\": [],\n" +
                        "              \"character_id\": \"TFT7_Ornn\",\n" +
                        "              \"itemNames\": [],\n" +
                        "              \"rarity\": 3,\n" +
                        "              \"tier\": 1\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"items\": [],\n" +
                        "              \"character_id\": \"TFT7_Bard\",\n" +
                        "              \"itemNames\": [],\n" +
                        "              \"rarity\": 5,\n" +
                        "              \"tier\": 1\n" +
                        "            },\n" +
                        "            null,\n" +
                        "            null,\n" +
                        "            null,\n" +
                        "            null,\n" +
                        "            null\n" +
                        "          ]\n" +
                        "        },\n" +
                        "        {\n" +
                        "          \"augments\": [\n" +
                        "            \"TFT6_Augment_RichGetRicher\",\n" +
                        "            \"TFT7_Augment_SwiftshotPressTheAttack\",\n" +
                        "            \"TFT6_Augment_Ascension\"\n" +
                        "          ],\n" +
                        "          \"companion\": {\n" +
                        "            \"content_ID\": \"2fc3a4c0-7322-4ef5-b434-0cea1d1997e6\",\n" +
                        "            \"skin_ID\": 1,\n" +
                        "            \"species\": \"PetChibiJinx\"\n" +
                        "          },\n" +
                        "          \"gold_left\": 1,\n" +
                        "          \"last_round\": 24,\n" +
                        "          \"level\": 7,\n" +
                        "          \"placement\": 8,\n" +
                        "          \"time_eliminated\": 1449.0519,\n" +
                        "          \"traits\": [\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Astral\",\n" +
                        "              \"num_units\": 3,\n" +
                        "              \"style\": 1,\n" +
                        "              \"tier_current\": 1,\n" +
                        "              \"tier_total\": 3\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Bard\",\n" +
                        "              \"num_units\": 1,\n" +
                        "              \"style\": 3,\n" +
                        "              \"tier_current\": 1,\n" +
                        "              \"tier_total\": 1\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Bruiser\",\n" +
                        "              \"num_units\": 4,\n" +
                        "              \"style\": 2,\n" +
                        "              \"tier_current\": 2,\n" +
                        "              \"tier_total\": 4\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Guild\",\n" +
                        "              \"num_units\": 2,\n" +
                        "              \"style\": 1,\n" +
                        "              \"tier_current\": 2,\n" +
                        "              \"tier_total\": 6\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Legend\",\n" +
                        "              \"num_units\": 1,\n" +
                        "              \"style\": 0,\n" +
                        "              \"tier_current\": 0,\n" +
                        "              \"tier_total\": 1\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Mystic\",\n" +
                        "              \"num_units\": 1,\n" +
                        "              \"style\": 0,\n" +
                        "              \"tier_current\": 0,\n" +
                        "              \"tier_total\": 4\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Ragewing\",\n" +
                        "              \"num_units\": 1,\n" +
                        "              \"style\": 0,\n" +
                        "              \"tier_current\": 0,\n" +
                        "              \"tier_total\": 3\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Swiftshot\",\n" +
                        "              \"num_units\": 2,\n" +
                        "              \"style\": 1,\n" +
                        "              \"tier_current\": 1,\n" +
                        "              \"tier_total\": 3\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Tempest\",\n" +
                        "              \"num_units\": 1,\n" +
                        "              \"style\": 0,\n" +
                        "              \"tier_current\": 0,\n" +
                        "              \"tier_total\": 4\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Warrior\",\n" +
                        "              \"num_units\": 1,\n" +
                        "              \"style\": 0,\n" +
                        "              \"tier_current\": 0,\n" +
                        "              \"tier_total\": 3\n" +
                        "            }\n" +
                        "          ],\n" +
                        "          \"units\": [\n" +
                        "            {\n" +
                        "              \"items\": [\n" +
                        "                35\n" +
                        "              ],\n" +
                        "              \"character_id\": \"TFT7_Skarner\",\n" +
                        "              \"itemNames\": [\n" +
                        "                \"TFT_Item_LocketOfTheIronSolari\"\n" +
                        "              ],\n" +
                        "              \"rarity\": 0,\n" +
                        "              \"tier\": 2\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"items\": [],\n" +
                        "              \"character_id\": \"TFT7_Shen\",\n" +
                        "              \"itemNames\": [],\n" +
                        "              \"rarity\": 1,\n" +
                        "              \"tier\": 2\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"items\": [],\n" +
                        "              \"character_id\": \"TFT7_Twitch\",\n" +
                        "              \"itemNames\": [],\n" +
                        "              \"rarity\": 1,\n" +
                        "              \"tier\": 2\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"items\": [\n" +
                        "                11,\n" +
                        "                23\n" +
                        "              ],\n" +
                        "              \"character_id\": \"TFT7_Varus\",\n" +
                        "              \"itemNames\": [\n" +
                        "                \"TFT_Item_Deathblade\",\n" +
                        "                \"TFT_Item_GuinsoosRageblade\"\n" +
                        "              ],\n" +
                        "              \"rarity\": 2,\n" +
                        "              \"tier\": 2\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"items\": [\n" +
                        "                77\n" +
                        "              ],\n" +
                        "              \"character_id\": \"TFT7_Illaoi\",\n" +
                        "              \"itemNames\": [\n" +
                        "                \"TFT_Item_WarmogsArmor\"\n" +
                        "              ],\n" +
                        "              \"rarity\": 2,\n" +
                        "              \"tier\": 2\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"items\": [],\n" +
                        "              \"character_id\": \"TFT7_Ornn\",\n" +
                        "              \"itemNames\": [],\n" +
                        "              \"rarity\": 3,\n" +
                        "              \"tier\": 1\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"items\": [],\n" +
                        "              \"character_id\": \"TFT7_Bard\",\n" +
                        "              \"itemNames\": [],\n" +
                        "              \"rarity\": 5,\n" +
                        "              \"tier\": 1\n" +
                        "            },\n" +
                        "            null,\n" +
                        "            null,\n" +
                        "            null,\n" +
                        "            null,\n" +
                        "            null\n" +
                        "          ]\n" +
                        "        },\n" +
                        "        {\n" +
                        "          \"augments\": [\n" +
                        "            \"TFT6_Augment_RichGetRicher\",\n" +
                        "            \"TFT7_Augment_SwiftshotPressTheAttack\",\n" +
                        "            \"TFT6_Augment_Ascension\"\n" +
                        "          ],\n" +
                        "          \"companion\": {\n" +
                        "            \"content_ID\": \"2fc3a4c0-7322-4ef5-b434-0cea1d1997e6\",\n" +
                        "            \"skin_ID\": 1,\n" +
                        "            \"species\": \"PetChibiJinx\"\n" +
                        "          },\n" +
                        "          \"gold_left\": 1,\n" +
                        "          \"last_round\": 24,\n" +
                        "          \"level\": 7,\n" +
                        "          \"placement\": 8,\n" +
                        "          \"time_eliminated\": 1449.0519,\n" +
                        "          \"traits\": [\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Astral\",\n" +
                        "              \"num_units\": 3,\n" +
                        "              \"style\": 1,\n" +
                        "              \"tier_current\": 1,\n" +
                        "              \"tier_total\": 3\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Bard\",\n" +
                        "              \"num_units\": 1,\n" +
                        "              \"style\": 3,\n" +
                        "              \"tier_current\": 1,\n" +
                        "              \"tier_total\": 1\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Bruiser\",\n" +
                        "              \"num_units\": 4,\n" +
                        "              \"style\": 2,\n" +
                        "              \"tier_current\": 2,\n" +
                        "              \"tier_total\": 4\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Guild\",\n" +
                        "              \"num_units\": 2,\n" +
                        "              \"style\": 1,\n" +
                        "              \"tier_current\": 2,\n" +
                        "              \"tier_total\": 6\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Legend\",\n" +
                        "              \"num_units\": 1,\n" +
                        "              \"style\": 0,\n" +
                        "              \"tier_current\": 0,\n" +
                        "              \"tier_total\": 1\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Mystic\",\n" +
                        "              \"num_units\": 1,\n" +
                        "              \"style\": 0,\n" +
                        "              \"tier_current\": 0,\n" +
                        "              \"tier_total\": 4\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Ragewing\",\n" +
                        "              \"num_units\": 1,\n" +
                        "              \"style\": 0,\n" +
                        "              \"tier_current\": 0,\n" +
                        "              \"tier_total\": 3\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Swiftshot\",\n" +
                        "              \"num_units\": 2,\n" +
                        "              \"style\": 1,\n" +
                        "              \"tier_current\": 1,\n" +
                        "              \"tier_total\": 3\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Tempest\",\n" +
                        "              \"num_units\": 1,\n" +
                        "              \"style\": 0,\n" +
                        "              \"tier_current\": 0,\n" +
                        "              \"tier_total\": 4\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Warrior\",\n" +
                        "              \"num_units\": 1,\n" +
                        "              \"style\": 0,\n" +
                        "              \"tier_current\": 0,\n" +
                        "              \"tier_total\": 3\n" +
                        "            }\n" +
                        "          ],\n" +
                        "          \"units\": [\n" +
                        "            {\n" +
                        "              \"items\": [\n" +
                        "                35\n" +
                        "              ],\n" +
                        "              \"character_id\": \"TFT7_Skarner\",\n" +
                        "              \"itemNames\": [\n" +
                        "                \"TFT_Item_LocketOfTheIronSolari\"\n" +
                        "              ],\n" +
                        "              \"rarity\": 0,\n" +
                        "              \"tier\": 2\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"items\": [],\n" +
                        "              \"character_id\": \"TFT7_Shen\",\n" +
                        "              \"itemNames\": [],\n" +
                        "              \"rarity\": 1,\n" +
                        "              \"tier\": 2\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"items\": [],\n" +
                        "              \"character_id\": \"TFT7_Twitch\",\n" +
                        "              \"itemNames\": [],\n" +
                        "              \"rarity\": 1,\n" +
                        "              \"tier\": 2\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"items\": [\n" +
                        "                11,\n" +
                        "                23\n" +
                        "              ],\n" +
                        "              \"character_id\": \"TFT7_Varus\",\n" +
                        "              \"itemNames\": [\n" +
                        "                \"TFT_Item_Deathblade\",\n" +
                        "                \"TFT_Item_GuinsoosRageblade\"\n" +
                        "              ],\n" +
                        "              \"rarity\": 2,\n" +
                        "              \"tier\": 2\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"items\": [\n" +
                        "                77\n" +
                        "              ],\n" +
                        "              \"character_id\": \"TFT7_Illaoi\",\n" +
                        "              \"itemNames\": [\n" +
                        "                \"TFT_Item_WarmogsArmor\"\n" +
                        "              ],\n" +
                        "              \"rarity\": 2,\n" +
                        "              \"tier\": 2\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"items\": [],\n" +
                        "              \"character_id\": \"TFT7_Ornn\",\n" +
                        "              \"itemNames\": [],\n" +
                        "              \"rarity\": 3,\n" +
                        "              \"tier\": 1\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"items\": [],\n" +
                        "              \"character_id\": \"TFT7_Bard\",\n" +
                        "              \"itemNames\": [],\n" +
                        "              \"rarity\": 5,\n" +
                        "              \"tier\": 1\n" +
                        "            },\n" +
                        "            null,\n" +
                        "            null,\n" +
                        "            null,\n" +
                        "            null,\n" +
                        "            null\n" +
                        "          ]\n" +
                        "        },\n" +
                        "        {\n" +
                        "          \"augments\": [\n" +
                        "            \"TFT6_Augment_RichGetRicher\",\n" +
                        "            \"TFT7_Augment_SwiftshotPressTheAttack\",\n" +
                        "            \"TFT6_Augment_Ascension\"\n" +
                        "          ],\n" +
                        "          \"companion\": {\n" +
                        "            \"content_ID\": \"2fc3a4c0-7322-4ef5-b434-0cea1d1997e6\",\n" +
                        "            \"skin_ID\": 1,\n" +
                        "            \"species\": \"PetChibiJinx\"\n" +
                        "          },\n" +
                        "          \"gold_left\": 1,\n" +
                        "          \"last_round\": 24,\n" +
                        "          \"level\": 7,\n" +
                        "          \"placement\": 8,\n" +
                        "          \"time_eliminated\": 1449.0519,\n" +
                        "          \"traits\": [\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Astral\",\n" +
                        "              \"num_units\": 3,\n" +
                        "              \"style\": 1,\n" +
                        "              \"tier_current\": 1,\n" +
                        "              \"tier_total\": 3\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Bard\",\n" +
                        "              \"num_units\": 1,\n" +
                        "              \"style\": 3,\n" +
                        "              \"tier_current\": 1,\n" +
                        "              \"tier_total\": 1\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Bruiser\",\n" +
                        "              \"num_units\": 4,\n" +
                        "              \"style\": 2,\n" +
                        "              \"tier_current\": 2,\n" +
                        "              \"tier_total\": 4\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Guild\",\n" +
                        "              \"num_units\": 2,\n" +
                        "              \"style\": 1,\n" +
                        "              \"tier_current\": 2,\n" +
                        "              \"tier_total\": 6\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Legend\",\n" +
                        "              \"num_units\": 1,\n" +
                        "              \"style\": 0,\n" +
                        "              \"tier_current\": 0,\n" +
                        "              \"tier_total\": 1\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Mystic\",\n" +
                        "              \"num_units\": 1,\n" +
                        "              \"style\": 0,\n" +
                        "              \"tier_current\": 0,\n" +
                        "              \"tier_total\": 4\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Ragewing\",\n" +
                        "              \"num_units\": 1,\n" +
                        "              \"style\": 0,\n" +
                        "              \"tier_current\": 0,\n" +
                        "              \"tier_total\": 3\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Swiftshot\",\n" +
                        "              \"num_units\": 2,\n" +
                        "              \"style\": 1,\n" +
                        "              \"tier_current\": 1,\n" +
                        "              \"tier_total\": 3\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Tempest\",\n" +
                        "              \"num_units\": 1,\n" +
                        "              \"style\": 0,\n" +
                        "              \"tier_current\": 0,\n" +
                        "              \"tier_total\": 4\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Warrior\",\n" +
                        "              \"num_units\": 1,\n" +
                        "              \"style\": 0,\n" +
                        "              \"tier_current\": 0,\n" +
                        "              \"tier_total\": 3\n" +
                        "            }\n" +
                        "          ],\n" +
                        "          \"units\": [\n" +
                        "            {\n" +
                        "              \"items\": [\n" +
                        "                35\n" +
                        "              ],\n" +
                        "              \"character_id\": \"TFT7_Skarner\",\n" +
                        "              \"itemNames\": [\n" +
                        "                \"TFT_Item_LocketOfTheIronSolari\"\n" +
                        "              ],\n" +
                        "              \"rarity\": 0,\n" +
                        "              \"tier\": 2\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"items\": [],\n" +
                        "              \"character_id\": \"TFT7_Shen\",\n" +
                        "              \"itemNames\": [],\n" +
                        "              \"rarity\": 1,\n" +
                        "              \"tier\": 2\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"items\": [],\n" +
                        "              \"character_id\": \"TFT7_Twitch\",\n" +
                        "              \"itemNames\": [],\n" +
                        "              \"rarity\": 1,\n" +
                        "              \"tier\": 2\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"items\": [\n" +
                        "                11,\n" +
                        "                23\n" +
                        "              ],\n" +
                        "              \"character_id\": \"TFT7_Varus\",\n" +
                        "              \"itemNames\": [\n" +
                        "                \"TFT_Item_Deathblade\",\n" +
                        "                \"TFT_Item_GuinsoosRageblade\"\n" +
                        "              ],\n" +
                        "              \"rarity\": 2,\n" +
                        "              \"tier\": 2\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"items\": [\n" +
                        "                77\n" +
                        "              ],\n" +
                        "              \"character_id\": \"TFT7_Illaoi\",\n" +
                        "              \"itemNames\": [\n" +
                        "                \"TFT_Item_WarmogsArmor\"\n" +
                        "              ],\n" +
                        "              \"rarity\": 2,\n" +
                        "              \"tier\": 2\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"items\": [],\n" +
                        "              \"character_id\": \"TFT7_Ornn\",\n" +
                        "              \"itemNames\": [],\n" +
                        "              \"rarity\": 3,\n" +
                        "              \"tier\": 1\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"items\": [],\n" +
                        "              \"character_id\": \"TFT7_Bard\",\n" +
                        "              \"itemNames\": [],\n" +
                        "              \"rarity\": 5,\n" +
                        "              \"tier\": 1\n" +
                        "            },\n" +
                        "            null,\n" +
                        "            null,\n" +
                        "            null,\n" +
                        "            null,\n" +
                        "            null\n" +
                        "          ]\n" +
                        "        },\n" +
                        "        {\n" +
                        "          \"augments\": [\n" +
                        "            \"TFT6_Augment_RichGetRicher\",\n" +
                        "            \"TFT7_Augment_SwiftshotPressTheAttack\",\n" +
                        "            \"TFT6_Augment_Ascension\"\n" +
                        "          ],\n" +
                        "          \"companion\": {\n" +
                        "            \"content_ID\": \"2fc3a4c0-7322-4ef5-b434-0cea1d1997e6\",\n" +
                        "            \"skin_ID\": 1,\n" +
                        "            \"species\": \"PetChibiJinx\"\n" +
                        "          },\n" +
                        "          \"gold_left\": 1,\n" +
                        "          \"last_round\": 24,\n" +
                        "          \"level\": 7,\n" +
                        "          \"placement\": 8,\n" +
                        "          \"time_eliminated\": 1449.0519,\n" +
                        "          \"traits\": [\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Astral\",\n" +
                        "              \"num_units\": 3,\n" +
                        "              \"style\": 1,\n" +
                        "              \"tier_current\": 1,\n" +
                        "              \"tier_total\": 3\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Bard\",\n" +
                        "              \"num_units\": 1,\n" +
                        "              \"style\": 3,\n" +
                        "              \"tier_current\": 1,\n" +
                        "              \"tier_total\": 1\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Bruiser\",\n" +
                        "              \"num_units\": 4,\n" +
                        "              \"style\": 2,\n" +
                        "              \"tier_current\": 2,\n" +
                        "              \"tier_total\": 4\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Guild\",\n" +
                        "              \"num_units\": 2,\n" +
                        "              \"style\": 1,\n" +
                        "              \"tier_current\": 2,\n" +
                        "              \"tier_total\": 6\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Legend\",\n" +
                        "              \"num_units\": 1,\n" +
                        "              \"style\": 0,\n" +
                        "              \"tier_current\": 0,\n" +
                        "              \"tier_total\": 1\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Mystic\",\n" +
                        "              \"num_units\": 1,\n" +
                        "              \"style\": 0,\n" +
                        "              \"tier_current\": 0,\n" +
                        "              \"tier_total\": 4\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Ragewing\",\n" +
                        "              \"num_units\": 1,\n" +
                        "              \"style\": 0,\n" +
                        "              \"tier_current\": 0,\n" +
                        "              \"tier_total\": 3\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Swiftshot\",\n" +
                        "              \"num_units\": 2,\n" +
                        "              \"style\": 1,\n" +
                        "              \"tier_current\": 1,\n" +
                        "              \"tier_total\": 3\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Tempest\",\n" +
                        "              \"num_units\": 1,\n" +
                        "              \"style\": 0,\n" +
                        "              \"tier_current\": 0,\n" +
                        "              \"tier_total\": 4\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Warrior\",\n" +
                        "              \"num_units\": 1,\n" +
                        "              \"style\": 0,\n" +
                        "              \"tier_current\": 0,\n" +
                        "              \"tier_total\": 3\n" +
                        "            }\n" +
                        "          ],\n" +
                        "          \"units\": [\n" +
                        "            {\n" +
                        "              \"items\": [\n" +
                        "                35\n" +
                        "              ],\n" +
                        "              \"character_id\": \"TFT7_Skarner\",\n" +
                        "              \"itemNames\": [\n" +
                        "                \"TFT_Item_LocketOfTheIronSolari\"\n" +
                        "              ],\n" +
                        "              \"rarity\": 0,\n" +
                        "              \"tier\": 2\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"items\": [],\n" +
                        "              \"character_id\": \"TFT7_Shen\",\n" +
                        "              \"itemNames\": [],\n" +
                        "              \"rarity\": 1,\n" +
                        "              \"tier\": 2\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"items\": [],\n" +
                        "              \"character_id\": \"TFT7_Twitch\",\n" +
                        "              \"itemNames\": [],\n" +
                        "              \"rarity\": 1,\n" +
                        "              \"tier\": 2\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"items\": [\n" +
                        "                11,\n" +
                        "                23\n" +
                        "              ],\n" +
                        "              \"character_id\": \"TFT7_Varus\",\n" +
                        "              \"itemNames\": [\n" +
                        "                \"TFT_Item_Deathblade\",\n" +
                        "                \"TFT_Item_GuinsoosRageblade\"\n" +
                        "              ],\n" +
                        "              \"rarity\": 2,\n" +
                        "              \"tier\": 2\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"items\": [\n" +
                        "                77\n" +
                        "              ],\n" +
                        "              \"character_id\": \"TFT7_Illaoi\",\n" +
                        "              \"itemNames\": [\n" +
                        "                \"TFT_Item_WarmogsArmor\"\n" +
                        "              ],\n" +
                        "              \"rarity\": 2,\n" +
                        "              \"tier\": 2\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"items\": [],\n" +
                        "              \"character_id\": \"TFT7_Ornn\",\n" +
                        "              \"itemNames\": [],\n" +
                        "              \"rarity\": 3,\n" +
                        "              \"tier\": 1\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"items\": [],\n" +
                        "              \"character_id\": \"TFT7_Bard\",\n" +
                        "              \"itemNames\": [],\n" +
                        "              \"rarity\": 5,\n" +
                        "              \"tier\": 1\n" +
                        "            },\n" +
                        "            null,\n" +
                        "            null,\n" +
                        "            null,\n" +
                        "            null,\n" +
                        "            null\n" +
                        "          ]\n" +
                        "        },\n" +
                        "        {\n" +
                        "          \"augments\": [\n" +
                        "            \"TFT6_Augment_RichGetRicher\",\n" +
                        "            \"TFT7_Augment_SwiftshotPressTheAttack\",\n" +
                        "            \"TFT6_Augment_Ascension\"\n" +
                        "          ],\n" +
                        "          \"companion\": {\n" +
                        "            \"content_ID\": \"2fc3a4c0-7322-4ef5-b434-0cea1d1997e6\",\n" +
                        "            \"skin_ID\": 1,\n" +
                        "            \"species\": \"PetChibiJinx\"\n" +
                        "          },\n" +
                        "          \"gold_left\": 1,\n" +
                        "          \"last_round\": 24,\n" +
                        "          \"level\": 7,\n" +
                        "          \"placement\": 8,\n" +
                        "          \"time_eliminated\": 1449.0519,\n" +
                        "          \"traits\": [\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Astral\",\n" +
                        "              \"num_units\": 3,\n" +
                        "              \"style\": 1,\n" +
                        "              \"tier_current\": 1,\n" +
                        "              \"tier_total\": 3\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Bard\",\n" +
                        "              \"num_units\": 1,\n" +
                        "              \"style\": 3,\n" +
                        "              \"tier_current\": 1,\n" +
                        "              \"tier_total\": 1\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Bruiser\",\n" +
                        "              \"num_units\": 4,\n" +
                        "              \"style\": 2,\n" +
                        "              \"tier_current\": 2,\n" +
                        "              \"tier_total\": 4\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Guild\",\n" +
                        "              \"num_units\": 2,\n" +
                        "              \"style\": 1,\n" +
                        "              \"tier_current\": 2,\n" +
                        "              \"tier_total\": 6\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Legend\",\n" +
                        "              \"num_units\": 1,\n" +
                        "              \"style\": 0,\n" +
                        "              \"tier_current\": 0,\n" +
                        "              \"tier_total\": 1\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Mystic\",\n" +
                        "              \"num_units\": 1,\n" +
                        "              \"style\": 0,\n" +
                        "              \"tier_current\": 0,\n" +
                        "              \"tier_total\": 4\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Ragewing\",\n" +
                        "              \"num_units\": 1,\n" +
                        "              \"style\": 0,\n" +
                        "              \"tier_current\": 0,\n" +
                        "              \"tier_total\": 3\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Swiftshot\",\n" +
                        "              \"num_units\": 2,\n" +
                        "              \"style\": 1,\n" +
                        "              \"tier_current\": 1,\n" +
                        "              \"tier_total\": 3\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Tempest\",\n" +
                        "              \"num_units\": 1,\n" +
                        "              \"style\": 0,\n" +
                        "              \"tier_current\": 0,\n" +
                        "              \"tier_total\": 4\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Warrior\",\n" +
                        "              \"num_units\": 1,\n" +
                        "              \"style\": 0,\n" +
                        "              \"tier_current\": 0,\n" +
                        "              \"tier_total\": 3\n" +
                        "            }\n" +
                        "          ],\n" +
                        "          \"units\": [\n" +
                        "            {\n" +
                        "              \"items\": [\n" +
                        "                35\n" +
                        "              ],\n" +
                        "              \"character_id\": \"TFT7_Skarner\",\n" +
                        "              \"itemNames\": [\n" +
                        "                \"TFT_Item_LocketOfTheIronSolari\"\n" +
                        "              ],\n" +
                        "              \"rarity\": 0,\n" +
                        "              \"tier\": 2\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"items\": [],\n" +
                        "              \"character_id\": \"TFT7_Shen\",\n" +
                        "              \"itemNames\": [],\n" +
                        "              \"rarity\": 1,\n" +
                        "              \"tier\": 2\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"items\": [],\n" +
                        "              \"character_id\": \"TFT7_Twitch\",\n" +
                        "              \"itemNames\": [],\n" +
                        "              \"rarity\": 1,\n" +
                        "              \"tier\": 2\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"items\": [\n" +
                        "                11,\n" +
                        "                23\n" +
                        "              ],\n" +
                        "              \"character_id\": \"TFT7_Varus\",\n" +
                        "              \"itemNames\": [\n" +
                        "                \"TFT_Item_Deathblade\",\n" +
                        "                \"TFT_Item_GuinsoosRageblade\"\n" +
                        "              ],\n" +
                        "              \"rarity\": 2,\n" +
                        "              \"tier\": 2\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"items\": [\n" +
                        "                77\n" +
                        "              ],\n" +
                        "              \"character_id\": \"TFT7_Illaoi\",\n" +
                        "              \"itemNames\": [\n" +
                        "                \"TFT_Item_WarmogsArmor\"\n" +
                        "              ],\n" +
                        "              \"rarity\": 2,\n" +
                        "              \"tier\": 2\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"items\": [],\n" +
                        "              \"character_id\": \"TFT7_Ornn\",\n" +
                        "              \"itemNames\": [],\n" +
                        "              \"rarity\": 3,\n" +
                        "              \"tier\": 1\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"items\": [],\n" +
                        "              \"character_id\": \"TFT7_Bard\",\n" +
                        "              \"itemNames\": [],\n" +
                        "              \"rarity\": 5,\n" +
                        "              \"tier\": 1\n" +
                        "            },\n" +
                        "            null,\n" +
                        "            null,\n" +
                        "            null,\n" +
                        "            null,\n" +
                        "            null\n" +
                        "          ]\n" +
                        "        },\n" +
                        "        {\n" +
                        "          \"augments\": [\n" +
                        "            \"TFT6_Augment_RichGetRicher\",\n" +
                        "            \"TFT7_Augment_SwiftshotPressTheAttack\",\n" +
                        "            \"TFT6_Augment_Ascension\"\n" +
                        "          ],\n" +
                        "          \"companion\": {\n" +
                        "            \"content_ID\": \"2fc3a4c0-7322-4ef5-b434-0cea1d1997e6\",\n" +
                        "            \"skin_ID\": 1,\n" +
                        "            \"species\": \"PetChibiJinx\"\n" +
                        "          },\n" +
                        "          \"gold_left\": 1,\n" +
                        "          \"last_round\": 24,\n" +
                        "          \"level\": 7,\n" +
                        "          \"placement\": 8,\n" +
                        "          \"time_eliminated\": 1449.0519,\n" +
                        "          \"traits\": [\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Astral\",\n" +
                        "              \"num_units\": 3,\n" +
                        "              \"style\": 1,\n" +
                        "              \"tier_current\": 1,\n" +
                        "              \"tier_total\": 3\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Bard\",\n" +
                        "              \"num_units\": 1,\n" +
                        "              \"style\": 3,\n" +
                        "              \"tier_current\": 1,\n" +
                        "              \"tier_total\": 1\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Bruiser\",\n" +
                        "              \"num_units\": 4,\n" +
                        "              \"style\": 2,\n" +
                        "              \"tier_current\": 2,\n" +
                        "              \"tier_total\": 4\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Guild\",\n" +
                        "              \"num_units\": 2,\n" +
                        "              \"style\": 1,\n" +
                        "              \"tier_current\": 2,\n" +
                        "              \"tier_total\": 6\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Legend\",\n" +
                        "              \"num_units\": 1,\n" +
                        "              \"style\": 0,\n" +
                        "              \"tier_current\": 0,\n" +
                        "              \"tier_total\": 1\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Mystic\",\n" +
                        "              \"num_units\": 1,\n" +
                        "              \"style\": 0,\n" +
                        "              \"tier_current\": 0,\n" +
                        "              \"tier_total\": 4\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Ragewing\",\n" +
                        "              \"num_units\": 1,\n" +
                        "              \"style\": 0,\n" +
                        "              \"tier_current\": 0,\n" +
                        "              \"tier_total\": 3\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Swiftshot\",\n" +
                        "              \"num_units\": 2,\n" +
                        "              \"style\": 1,\n" +
                        "              \"tier_current\": 1,\n" +
                        "              \"tier_total\": 3\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Tempest\",\n" +
                        "              \"num_units\": 1,\n" +
                        "              \"style\": 0,\n" +
                        "              \"tier_current\": 0,\n" +
                        "              \"tier_total\": 4\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Warrior\",\n" +
                        "              \"num_units\": 1,\n" +
                        "              \"style\": 0,\n" +
                        "              \"tier_current\": 0,\n" +
                        "              \"tier_total\": 3\n" +
                        "            }\n" +
                        "          ],\n" +
                        "          \"units\": [\n" +
                        "            {\n" +
                        "              \"items\": [\n" +
                        "                35\n" +
                        "              ],\n" +
                        "              \"character_id\": \"TFT7_Skarner\",\n" +
                        "              \"itemNames\": [\n" +
                        "                \"TFT_Item_LocketOfTheIronSolari\"\n" +
                        "              ],\n" +
                        "              \"rarity\": 0,\n" +
                        "              \"tier\": 2\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"items\": [],\n" +
                        "              \"character_id\": \"TFT7_Shen\",\n" +
                        "              \"itemNames\": [],\n" +
                        "              \"rarity\": 1,\n" +
                        "              \"tier\": 2\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"items\": [],\n" +
                        "              \"character_id\": \"TFT7_Twitch\",\n" +
                        "              \"itemNames\": [],\n" +
                        "              \"rarity\": 1,\n" +
                        "              \"tier\": 2\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"items\": [\n" +
                        "                11,\n" +
                        "                23\n" +
                        "              ],\n" +
                        "              \"character_id\": \"TFT7_Varus\",\n" +
                        "              \"itemNames\": [\n" +
                        "                \"TFT_Item_Deathblade\",\n" +
                        "                \"TFT_Item_GuinsoosRageblade\"\n" +
                        "              ],\n" +
                        "              \"rarity\": 2,\n" +
                        "              \"tier\": 2\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"items\": [\n" +
                        "                77\n" +
                        "              ],\n" +
                        "              \"character_id\": \"TFT7_Illaoi\",\n" +
                        "              \"itemNames\": [\n" +
                        "                \"TFT_Item_WarmogsArmor\"\n" +
                        "              ],\n" +
                        "              \"rarity\": 2,\n" +
                        "              \"tier\": 2\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"items\": [],\n" +
                        "              \"character_id\": \"TFT7_Ornn\",\n" +
                        "              \"itemNames\": [],\n" +
                        "              \"rarity\": 3,\n" +
                        "              \"tier\": 1\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"items\": [],\n" +
                        "              \"character_id\": \"TFT7_Bard\",\n" +
                        "              \"itemNames\": [],\n" +
                        "              \"rarity\": 5,\n" +
                        "              \"tier\": 1\n" +
                        "            },\n" +
                        "            null,\n" +
                        "            null,\n" +
                        "            null,\n" +
                        "            null,\n" +
                        "            null\n" +
                        "          ]\n" +
                        "        },\n" +
                        "        {\n" +
                        "          \"augments\": [\n" +
                        "            \"TFT6_Augment_RichGetRicher\",\n" +
                        "            \"TFT7_Augment_SwiftshotPressTheAttack\",\n" +
                        "            \"TFT6_Augment_Ascension\"\n" +
                        "          ],\n" +
                        "          \"companion\": {\n" +
                        "            \"content_ID\": \"2fc3a4c0-7322-4ef5-b434-0cea1d1997e6\",\n" +
                        "            \"skin_ID\": 1,\n" +
                        "            \"species\": \"PetChibiJinx\"\n" +
                        "          },\n" +
                        "          \"gold_left\": 1,\n" +
                        "          \"last_round\": 24,\n" +
                        "          \"level\": 7,\n" +
                        "          \"placement\": 8,\n" +
                        "          \"time_eliminated\": 1449.0519,\n" +
                        "          \"traits\": [\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Astral\",\n" +
                        "              \"num_units\": 3,\n" +
                        "              \"style\": 1,\n" +
                        "              \"tier_current\": 1,\n" +
                        "              \"tier_total\": 3\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Bard\",\n" +
                        "              \"num_units\": 1,\n" +
                        "              \"style\": 3,\n" +
                        "              \"tier_current\": 1,\n" +
                        "              \"tier_total\": 1\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Bruiser\",\n" +
                        "              \"num_units\": 4,\n" +
                        "              \"style\": 2,\n" +
                        "              \"tier_current\": 2,\n" +
                        "              \"tier_total\": 4\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Guild\",\n" +
                        "              \"num_units\": 2,\n" +
                        "              \"style\": 1,\n" +
                        "              \"tier_current\": 2,\n" +
                        "              \"tier_total\": 6\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Legend\",\n" +
                        "              \"num_units\": 1,\n" +
                        "              \"style\": 0,\n" +
                        "              \"tier_current\": 0,\n" +
                        "              \"tier_total\": 1\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Mystic\",\n" +
                        "              \"num_units\": 1,\n" +
                        "              \"style\": 0,\n" +
                        "              \"tier_current\": 0,\n" +
                        "              \"tier_total\": 4\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Ragewing\",\n" +
                        "              \"num_units\": 1,\n" +
                        "              \"style\": 0,\n" +
                        "              \"tier_current\": 0,\n" +
                        "              \"tier_total\": 3\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Swiftshot\",\n" +
                        "              \"num_units\": 2,\n" +
                        "              \"style\": 1,\n" +
                        "              \"tier_current\": 1,\n" +
                        "              \"tier_total\": 3\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Tempest\",\n" +
                        "              \"num_units\": 1,\n" +
                        "              \"style\": 0,\n" +
                        "              \"tier_current\": 0,\n" +
                        "              \"tier_total\": 4\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"name\": \"Set7_Warrior\",\n" +
                        "              \"num_units\": 1,\n" +
                        "              \"style\": 0,\n" +
                        "              \"tier_current\": 0,\n" +
                        "              \"tier_total\": 3\n" +
                        "            }\n" +
                        "          ],\n" +
                        "          \"units\": [\n" +
                        "            {\n" +
                        "              \"items\": [\n" +
                        "                35\n" +
                        "              ],\n" +
                        "              \"character_id\": \"TFT7_Skarner\",\n" +
                        "              \"itemNames\": [\n" +
                        "                \"TFT_Item_LocketOfTheIronSolari\"\n" +
                        "              ],\n" +
                        "              \"rarity\": 0,\n" +
                        "              \"tier\": 2\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"items\": [],\n" +
                        "              \"character_id\": \"TFT7_Shen\",\n" +
                        "              \"itemNames\": [],\n" +
                        "              \"rarity\": 1,\n" +
                        "              \"tier\": 2\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"items\": [],\n" +
                        "              \"character_id\": \"TFT7_Twitch\",\n" +
                        "              \"itemNames\": [],\n" +
                        "              \"rarity\": 1,\n" +
                        "              \"tier\": 2\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"items\": [\n" +
                        "                11,\n" +
                        "                23\n" +
                        "              ],\n" +
                        "              \"character_id\": \"TFT7_Varus\",\n" +
                        "              \"itemNames\": [\n" +
                        "                \"TFT_Item_Deathblade\",\n" +
                        "                \"TFT_Item_GuinsoosRageblade\"\n" +
                        "              ],\n" +
                        "              \"rarity\": 2,\n" +
                        "              \"tier\": 2\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"items\": [\n" +
                        "                77\n" +
                        "              ],\n" +
                        "              \"character_id\": \"TFT7_Illaoi\",\n" +
                        "              \"itemNames\": [\n" +
                        "                \"TFT_Item_WarmogsArmor\"\n" +
                        "              ],\n" +
                        "              \"rarity\": 2,\n" +
                        "              \"tier\": 2\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"items\": [],\n" +
                        "              \"character_id\": \"TFT7_Ornn\",\n" +
                        "              \"itemNames\": [],\n" +
                        "              \"rarity\": 3,\n" +
                        "              \"tier\": 1\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"items\": [],\n" +
                        "              \"character_id\": \"TFT7_Bard\",\n" +
                        "              \"itemNames\": [],\n" +
                        "              \"rarity\": 5,\n" +
                        "              \"tier\": 1\n" +
                        "            },\n" +
                        "            null,\n" +
                        "            null,\n" +
                        "            null,\n" +
                        "            null,\n" +
                        "            null\n" +
                        "          ]\n" +
                        "        }\n" +
                        "      ]\n" +
                        "    }\n" +
                        "  ]\n" +
                        "}")
                .build();
        matchRepository.save(matchid);
    }
}
