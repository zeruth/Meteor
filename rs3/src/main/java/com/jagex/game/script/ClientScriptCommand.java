package com.jagex.game.script;

import deob.ObfuscatedName;

public class ClientScriptCommand implements ScriptCommand {

    public static final ClientScriptCommand PUSH_CONSTANT_INT = new ClientScriptCommand(204, true);

    public static final ClientScriptCommand PUSH_VAR = new ClientScriptCommand(524, true);

    public static final ClientScriptCommand POP_VAR = new ClientScriptCommand(482, true);

    public static final ClientScriptCommand PUSH_VARBIT = new ClientScriptCommand(1351, true);

    public static final ClientScriptCommand POP_VARBIT = new ClientScriptCommand(239, true);

    public static final ClientScriptCommand PUSH_CONSTANT_STRING = new ClientScriptCommand(1376, true);

    public static final ClientScriptCommand BRANCH = new ClientScriptCommand(866, true);

    public static final ClientScriptCommand BRANCH_NOT = new ClientScriptCommand(543, true);

    public static final ClientScriptCommand BRANCH_EQUALS = new ClientScriptCommand(1419, true);

    public static final ClientScriptCommand BRANCH_LESS_THAN = new ClientScriptCommand(1328, true);

    public static final ClientScriptCommand BRANCH_GREATER_THAN = new ClientScriptCommand(693, true);

    public static final ClientScriptCommand BRANCH_LESS_THAN_OR_EQUALS = new ClientScriptCommand(1066, true);

    public static final ClientScriptCommand BRANCH_GREATER_THAN_OR_EQUALS = new ClientScriptCommand(1122, true);

    public static final ClientScriptCommand PUSH_INT_LOCAL = new ClientScriptCommand(356, true);

    public static final ClientScriptCommand POP_INT_LOCAL = new ClientScriptCommand(1071, true);

    public static final ClientScriptCommand PUSH_STRING_LOCAL = new ClientScriptCommand(815, true);

    public static final ClientScriptCommand POP_STRING_LOCAL = new ClientScriptCommand(193, true);

    public static final ClientScriptCommand JOIN_STRING = new ClientScriptCommand(68, true);

    public static final ClientScriptCommand POP_INT_DISCARD = new ClientScriptCommand(1213, false);

    public static final ClientScriptCommand POP_STRING_DISCARD = new ClientScriptCommand(222, false);

    public static final ClientScriptCommand GOSUB_WITH_PARAMS = new ClientScriptCommand(49, true);

    public static final ClientScriptCommand DEFINE_ARRAY = new ClientScriptCommand(50, true);

    public static final ClientScriptCommand PUSH_ARRAY = new ClientScriptCommand(186, true);

    public static final ClientScriptCommand POP_ARRAY = new ClientScriptCommand(531, true);

    public static final ClientScriptCommand _SWITCH = new ClientScriptCommand(1167, true);

    public static final ClientScriptCommand PUSH_LONG_CONSTANT = new ClientScriptCommand(761, true);

    public static final ClientScriptCommand POP_LONG_DISCARD = new ClientScriptCommand(430, true);

    public static final ClientScriptCommand PUSH_LONG_LOCAL = new ClientScriptCommand(548, true);

    public static final ClientScriptCommand POP_LONG_LOCAL = new ClientScriptCommand(405, true);

    public static final ClientScriptCommand LONG_BRANCH_NOT = new ClientScriptCommand(338, true);

    public static final ClientScriptCommand LONG_BRANCH_EQUALS = new ClientScriptCommand(1403, true);

    public static final ClientScriptCommand LONG_BRANCH_LESS_THAN = new ClientScriptCommand(1286, true);

    public static final ClientScriptCommand LONG_BRANCH_GREATER_THAN = new ClientScriptCommand(564, true);

    public static final ClientScriptCommand LONG_BRANCH_LESS_THAN_OR_EQUALS = new ClientScriptCommand(1103, true);

    public static final ClientScriptCommand LONG_BRANCH_GREATER_THAN_OR_EQUALS = new ClientScriptCommand(411, true);

    public static final ClientScriptCommand PUSH_ARRAY2 = new ClientScriptCommand(945, true);

    public static final ClientScriptCommand PUSH_ARRAY3 = new ClientScriptCommand(69, true);

    public static final ClientScriptCommand POP_ARRAY2 = new ClientScriptCommand(529, true);

    public static final ClientScriptCommand BRANCH_IF_TRUE = new ClientScriptCommand(464, true);

    public static final ClientScriptCommand BRANCH_IF_FALSE = new ClientScriptCommand(127, true);

    public static final ClientScriptCommand field6373 = new ClientScriptCommand(734);

    public static final ClientScriptCommand field5180 = new ClientScriptCommand(1244);

    public static final ClientScriptCommand field5181 = new ClientScriptCommand(468);

    public static final ClientScriptCommand field5182 = new ClientScriptCommand(103);

    public static final ClientScriptCommand field5183 = new ClientScriptCommand(12);

    public static final ClientScriptCommand field5184 = new ClientScriptCommand(490);

    public static final ClientScriptCommand field5994 = new ClientScriptCommand(587);

    public static final ClientScriptCommand field5633 = new ClientScriptCommand(278);

    public static final ClientScriptCommand field5187 = new ClientScriptCommand(336);

    public static final ClientScriptCommand field5447 = new ClientScriptCommand(1355);

    public static final ClientScriptCommand field5189 = new ClientScriptCommand(64);

    public static final ClientScriptCommand field6230 = new ClientScriptCommand(1011);

    public static final ClientScriptCommand field5493 = new ClientScriptCommand(1215);

    public static final ClientScriptCommand field5863 = new ClientScriptCommand(546);

    public static final ClientScriptCommand field5193 = new ClientScriptCommand(915);

    public static final ClientScriptCommand field5194 = new ClientScriptCommand(878);

    public static final ClientScriptCommand field5195 = new ClientScriptCommand(519);

    public static final ClientScriptCommand field5196 = new ClientScriptCommand(633);

    public static final ClientScriptCommand field5139 = new ClientScriptCommand(643);

    public static final ClientScriptCommand field5198 = new ClientScriptCommand(604);

    public static final ClientScriptCommand field5199 = new ClientScriptCommand(1124);

    public static final ClientScriptCommand field5200 = new ClientScriptCommand(669);

    public static final ClientScriptCommand field5359 = new ClientScriptCommand(419);

    public static final ClientScriptCommand field5202 = new ClientScriptCommand(256);

    public static final ClientScriptCommand field5203 = new ClientScriptCommand(365);

    public static final ClientScriptCommand field5204 = new ClientScriptCommand(343);

    public static final ClientScriptCommand field5205 = new ClientScriptCommand(1052);

    public static final ClientScriptCommand field5206 = new ClientScriptCommand(288);

    public static final ClientScriptCommand field5207 = new ClientScriptCommand(890);

    public static final ClientScriptCommand field5457 = new ClientScriptCommand(853);

    public static final ClientScriptCommand field5209 = new ClientScriptCommand(922);

    public static final ClientScriptCommand field5210 = new ClientScriptCommand(1198);

    public static final ClientScriptCommand field5503 = new ClientScriptCommand(792);

    public static final ClientScriptCommand field5212 = new ClientScriptCommand(1104);

    public static final ClientScriptCommand field5213 = new ClientScriptCommand(1204);

    public static final ClientScriptCommand field5214 = new ClientScriptCommand(120);

    public static final ClientScriptCommand field5215 = new ClientScriptCommand(1132);

    public static final ClientScriptCommand field5216 = new ClientScriptCommand(525);

    public static final ClientScriptCommand field5217 = new ClientScriptCommand(249);

    public static final ClientScriptCommand field5475 = new ClientScriptCommand(1172);

    public static final ClientScriptCommand field6040 = new ClientScriptCommand(714);

    public static final ClientScriptCommand field6229 = new ClientScriptCommand(321);

    public static final ClientScriptCommand field5221 = new ClientScriptCommand(395);

    public static final ClientScriptCommand field5222 = new ClientScriptCommand(611);

    public static final ClientScriptCommand field5436 = new ClientScriptCommand(1251);

    public static final ClientScriptCommand field5224 = new ClientScriptCommand(361);

    public static final ClientScriptCommand field5225 = new ClientScriptCommand(735);

    public static final ClientScriptCommand field5226 = new ClientScriptCommand(88);

    public static final ClientScriptCommand field5227 = new ClientScriptCommand(755);

    public static final ClientScriptCommand field5228 = new ClientScriptCommand(285);

    public static final ClientScriptCommand field5995 = new ClientScriptCommand(1417);

    public static final ClientScriptCommand field5230 = new ClientScriptCommand(583);

    public static final ClientScriptCommand field6028 = new ClientScriptCommand(377);

    public static final ClientScriptCommand field5232 = new ClientScriptCommand(1152);

    public static final ClientScriptCommand field5414 = new ClientScriptCommand(437);

    public static final ClientScriptCommand field5158 = new ClientScriptCommand(1034);

    public static final ClientScriptCommand field5846 = new ClientScriptCommand(176);

    public static final ClientScriptCommand field5236 = new ClientScriptCommand(13);

    public static final ClientScriptCommand field5861 = new ClientScriptCommand(834);

    public static final ClientScriptCommand field5238 = new ClientScriptCommand(995);

    public static final ClientScriptCommand field5239 = new ClientScriptCommand(972);

    public static final ClientScriptCommand field5780 = new ClientScriptCommand(1327);

    public static final ClientScriptCommand field5241 = new ClientScriptCommand(821);

    public static final ClientScriptCommand field6151 = new ClientScriptCommand(780);

    public static final ClientScriptCommand field5243 = new ClientScriptCommand(270);

    public static final ClientScriptCommand field5244 = new ClientScriptCommand(912);

    public static final ClientScriptCommand field5952 = new ClientScriptCommand(1371);

    public static final ClientScriptCommand field5966 = new ClientScriptCommand(1250);

    public static final ClientScriptCommand field5575 = new ClientScriptCommand(1322);

    public static final ClientScriptCommand field5248 = new ClientScriptCommand(294);

    public static final ClientScriptCommand field6097 = new ClientScriptCommand(682);

    public static final ClientScriptCommand field5250 = new ClientScriptCommand(953);

    public static final ClientScriptCommand field5229 = new ClientScriptCommand(1399);

    public static final ClientScriptCommand field5252 = new ClientScriptCommand(433);

    public static final ClientScriptCommand field5253 = new ClientScriptCommand(1300);

    public static final ClientScriptCommand field5254 = new ClientScriptCommand(835);

    public static final ClientScriptCommand field5255 = new ClientScriptCommand(597);

    public static final ClientScriptCommand field5256 = new ClientScriptCommand(964);

    public static final ClientScriptCommand field5257 = new ClientScriptCommand(1107);

    public static final ClientScriptCommand field5258 = new ClientScriptCommand(31);

    public static final ClientScriptCommand field5497 = new ClientScriptCommand(1012);

    public static final ClientScriptCommand field5260 = new ClientScriptCommand(396);

    public static final ClientScriptCommand field6348 = new ClientScriptCommand(1388);

    public static final ClientScriptCommand field5262 = new ClientScriptCommand(1285);

    public static final ClientScriptCommand field5263 = new ClientScriptCommand(335);

    public static final ClientScriptCommand field6494 = new ClientScriptCommand(545);

    public static final ClientScriptCommand field5552 = new ClientScriptCommand(40);

    public static final ClientScriptCommand field5266 = new ClientScriptCommand(237);

    public static final ClientScriptCommand field5267 = new ClientScriptCommand(1237);

    public static final ClientScriptCommand field5268 = new ClientScriptCommand(425);

    public static final ClientScriptCommand field5269 = new ClientScriptCommand(999);

    public static final ClientScriptCommand field5270 = new ClientScriptCommand(158);

    public static final ClientScriptCommand field5271 = new ClientScriptCommand(1293);

    public static final ClientScriptCommand field5190 = new ClientScriptCommand(177);

    public static final ClientScriptCommand field5597 = new ClientScriptCommand(132);

    public static final ClientScriptCommand field5514 = new ClientScriptCommand(155);

    public static final ClientScriptCommand field5275 = new ClientScriptCommand(1228);

    public static final ClientScriptCommand field6508 = new ClientScriptCommand(948);

    public static final ClientScriptCommand field5277 = new ClientScriptCommand(987);

    public static final ClientScriptCommand field6185 = new ClientScriptCommand(649);

    public static final ClientScriptCommand field5279 = new ClientScriptCommand(1174);

    public static final ClientScriptCommand field5280 = new ClientScriptCommand(554);

    public static final ClientScriptCommand field6425 = new ClientScriptCommand(861);

    public static final ClientScriptCommand field5452 = new ClientScriptCommand(1109);

    public static final ClientScriptCommand field6340 = new ClientScriptCommand(1220);

    public static final ClientScriptCommand field5284 = new ClientScriptCommand(1053);

    public static final ClientScriptCommand field5285 = new ClientScriptCommand(1117);

    public static final ClientScriptCommand field5286 = new ClientScriptCommand(1111);

    public static final ClientScriptCommand field5287 = new ClientScriptCommand(1279);

    public static final ClientScriptCommand field5984 = new ClientScriptCommand(82);

    public static final ClientScriptCommand field5289 = new ClientScriptCommand(23);

    public static final ClientScriptCommand field5290 = new ClientScriptCommand(118);

    public static final ClientScriptCommand field5291 = new ClientScriptCommand(275);

    public static final ClientScriptCommand field6381 = new ClientScriptCommand(319);

    public static final ClientScriptCommand field5293 = new ClientScriptCommand(1129);

    public static final ClientScriptCommand field6020 = new ClientScriptCommand(337);

    public static final ClientScriptCommand field5295 = new ClientScriptCommand(330);

    public static final ClientScriptCommand field5296 = new ClientScriptCommand(21);

    public static final ClientScriptCommand field5297 = new ClientScriptCommand(225);

    public static final ClientScriptCommand field6064 = new ClientScriptCommand(1057);

    public static final ClientScriptCommand field5299 = new ClientScriptCommand(153);

    public static final ClientScriptCommand field5300 = new ClientScriptCommand(149);

    public static final ClientScriptCommand field5433 = new ClientScriptCommand(1077);

    public static final ClientScriptCommand field5850 = new ClientScriptCommand(376);

    public static final ClientScriptCommand field6072 = new ClientScriptCommand(1314);

    public static final ClientScriptCommand field5783 = new ClientScriptCommand(949);

    public static final ClientScriptCommand field5680 = new ClientScriptCommand(742);

    public static final ClientScriptCommand field5306 = new ClientScriptCommand(373);

    public static final ClientScriptCommand field5307 = new ClientScriptCommand(362);

    public static final ClientScriptCommand field5905 = new ClientScriptCommand(1006);

    public static final ClientScriptCommand field5309 = new ClientScriptCommand(710);

    public static final ClientScriptCommand field5723 = new ClientScriptCommand(242);

    public static final ClientScriptCommand field5311 = new ClientScriptCommand(1311);

    public static final ClientScriptCommand field5890 = new ClientScriptCommand(16);

    public static final ClientScriptCommand field5313 = new ClientScriptCommand(781);

    public static final ClientScriptCommand field5314 = new ClientScriptCommand(1413);

    public static final ClientScriptCommand field5315 = new ClientScriptCommand(383);

    public static final ClientScriptCommand field6087 = new ClientScriptCommand(1042);

    public static final ClientScriptCommand field5317 = new ClientScriptCommand(124);

    public static final ClientScriptCommand field5924 = new ClientScriptCommand(731);

    public static final ClientScriptCommand field5319 = new ClientScriptCommand(1037);

    public static final ClientScriptCommand field5320 = new ClientScriptCommand(778);

    public static final ClientScriptCommand field5321 = new ClientScriptCommand(1227);

    public static final ClientScriptCommand field6216 = new ClientScriptCommand(435);

    public static final ClientScriptCommand field5862 = new ClientScriptCommand(622);

    public static final ClientScriptCommand field5324 = new ClientScriptCommand(898);

    public static final ClientScriptCommand field5325 = new ClientScriptCommand(352);

    public static final ClientScriptCommand field5833 = new ClientScriptCommand(530);

    public static final ClientScriptCommand field5298 = new ClientScriptCommand(1224);

    public static final ClientScriptCommand field5328 = new ClientScriptCommand(185);

    public static final ClientScriptCommand field5329 = new ClientScriptCommand(1160);

    public static final ClientScriptCommand field5330 = new ClientScriptCommand(424);

    public static final ClientScriptCommand field6246 = new ClientScriptCommand(325);

    public static final ClientScriptCommand field5332 = new ClientScriptCommand(760);

    public static final ClientScriptCommand field5413 = new ClientScriptCommand(1137);

    public static final ClientScriptCommand field5304 = new ClientScriptCommand(230);

    public static final ClientScriptCommand field5335 = new ClientScriptCommand(91);

    public static final ClientScriptCommand field5336 = new ClientScriptCommand(1114);

    public static final ClientScriptCommand field6301 = new ClientScriptCommand(465);

    public static final ClientScriptCommand field5338 = new ClientScriptCommand(299);

    public static final ClientScriptCommand field6096 = new ClientScriptCommand(1341);

    public static final ClientScriptCommand field5340 = new ClientScriptCommand(51);

    public static final ClientScriptCommand field5602 = new ClientScriptCommand(83);

    public static final ClientScriptCommand field6431 = new ClientScriptCommand(879);

    public static final ClientScriptCommand field5343 = new ClientScriptCommand(107);

    public static final ClientScriptCommand field5344 = new ClientScriptCommand(436);

    public static final ClientScriptCommand field5801 = new ClientScriptCommand(979);

    public static final ClientScriptCommand field5574 = new ClientScriptCommand(940);

    public static final ClientScriptCommand field5347 = new ClientScriptCommand(131);

    public static final ClientScriptCommand field5348 = new ClientScriptCommand(1391);

    public static final ClientScriptCommand field5349 = new ClientScriptCommand(157);

    public static final ClientScriptCommand field5350 = new ClientScriptCommand(451);

    public static final ClientScriptCommand field5579 = new ClientScriptCommand(1171);

    public static final ClientScriptCommand field5352 = new ClientScriptCommand(644);

    public static final ClientScriptCommand field5353 = new ClientScriptCommand(1013);

    public static final ClientScriptCommand field5354 = new ClientScriptCommand(736);

    public static final ClientScriptCommand field5355 = new ClientScriptCommand(614);

    public static final ClientScriptCommand field5356 = new ClientScriptCommand(1177);

    public static final ClientScriptCommand field5357 = new ClientScriptCommand(680);

    public static final ClientScriptCommand field5358 = new ClientScriptCommand(189);

    public static final ClientScriptCommand field5720 = new ClientScriptCommand(1112);

    public static final ClientScriptCommand field5360 = new ClientScriptCommand(1087);

    public static final ClientScriptCommand field5361 = new ClientScriptCommand(198);

    public static final ClientScriptCommand field5362 = new ClientScriptCommand(85);

    public static final ClientScriptCommand field5363 = new ClientScriptCommand(1409);

    public static final ClientScriptCommand field6150 = new ClientScriptCommand(48);

    public static final ClientScriptCommand field5365 = new ClientScriptCommand(399);

    public static final ClientScriptCommand field5366 = new ClientScriptCommand(369);

    public static final ClientScriptCommand field5367 = new ClientScriptCommand(808);

    public static final ClientScriptCommand field5368 = new ClientScriptCommand(950);

    public static final ClientScriptCommand field5931 = new ClientScriptCommand(1163);

    public static final ClientScriptCommand field5168 = new ClientScriptCommand(1050);

    public static final ClientScriptCommand field5371 = new ClientScriptCommand(460);

    public static final ClientScriptCommand field5372 = new ClientScriptCommand(271);

    public static final ClientScriptCommand field5942 = new ClientScriptCommand(1059);

    public static final ClientScriptCommand field5454 = new ClientScriptCommand(262);

    public static final ClientScriptCommand field6288 = new ClientScriptCommand(722);

    public static final ClientScriptCommand field5376 = new ClientScriptCommand(849);

    public static final ClientScriptCommand field5155 = new ClientScriptCommand(263);

    public static final ClientScriptCommand field6195 = new ClientScriptCommand(985);

    public static final ClientScriptCommand field5529 = new ClientScriptCommand(892);

    public static final ClientScriptCommand field6063 = new ClientScriptCommand(994);

    public static final ClientScriptCommand field5381 = new ClientScriptCommand(1365);

    public static final ClientScriptCommand field5393 = new ClientScriptCommand(841);

    public static final ClientScriptCommand field6434 = new ClientScriptCommand(432);

    public static final ClientScriptCommand field5867 = new ClientScriptCommand(1143);

    public static final ClientScriptCommand field6104 = new ClientScriptCommand(605);

    public static final ClientScriptCommand field5331 = new ClientScriptCommand(574);

    public static final ClientScriptCommand field5387 = new ClientScriptCommand(759);

    public static final ClientScriptCommand field5388 = new ClientScriptCommand(229);

    public static final ClientScriptCommand field5389 = new ClientScriptCommand(2);

    public static final ClientScriptCommand field5390 = new ClientScriptCommand(327);

    public static final ClientScriptCommand field5391 = new ClientScriptCommand(779);

    public static final ClientScriptCommand field5392 = new ClientScriptCommand(576);

    public static final ClientScriptCommand field5223 = new ClientScriptCommand(1189);

    public static final ClientScriptCommand field6189 = new ClientScriptCommand(630);

    public static final ClientScriptCommand field5656 = new ClientScriptCommand(1358);

    public static final ClientScriptCommand field6316 = new ClientScriptCommand(561);

    public static final ClientScriptCommand field6071 = new ClientScriptCommand(476);

    public static final ClientScriptCommand field5729 = new ClientScriptCommand(491);

    public static final ClientScriptCommand field6177 = new ClientScriptCommand(1029);

    public static final ClientScriptCommand field5400 = new ClientScriptCommand(452);

    public static final ClientScriptCommand field5407 = new ClientScriptCommand(1262);

    public static final ClientScriptCommand field6018 = new ClientScriptCommand(1291);

    public static final ClientScriptCommand field5403 = new ClientScriptCommand(54);

    public static final ClientScriptCommand field5404 = new ClientScriptCommand(162);

    public static final ClientScriptCommand field5161 = new ClientScriptCommand(101);

    public static final ClientScriptCommand field5406 = new ClientScriptCommand(901);

    public static final ClientScriptCommand field6267 = new ClientScriptCommand(276);

    public static final ClientScriptCommand field5408 = new ClientScriptCommand(924);

    public static final ClientScriptCommand field5409 = new ClientScriptCommand(512);

    public static final ClientScriptCommand field5410 = new ClientScriptCommand(1315);

    public static final ClientScriptCommand field5411 = new ClientScriptCommand(585);

    public static final ClientScriptCommand field5412 = new ClientScriptCommand(485);

    public static final ClientScriptCommand field5481 = new ClientScriptCommand(292);

    public static final ClientScriptCommand field6445 = new ClientScriptCommand(301);

    public static final ClientScriptCommand field6423 = new ClientScriptCommand(775);

    public static final ClientScriptCommand field5416 = new ClientScriptCommand(776);

    public static final ClientScriptCommand field5417 = new ClientScriptCommand(538);

    public static final ClientScriptCommand field6465 = new ClientScriptCommand(1130);

    public static final ClientScriptCommand field6522 = new ClientScriptCommand(926);

    public static final ClientScriptCommand field5420 = new ClientScriptCommand(1201);

    public static final ClientScriptCommand field5421 = new ClientScriptCommand(317);

    public static final ClientScriptCommand field5422 = new ClientScriptCommand(179);

    public static final ClientScriptCommand field5423 = new ClientScriptCommand(170);

    public static final ClientScriptCommand field5424 = new ClientScriptCommand(737);

    public static final ClientScriptCommand field5425 = new ClientScriptCommand(518);

    public static final ClientScriptCommand field5385 = new ClientScriptCommand(989);

    public static final ClientScriptCommand field5427 = new ClientScriptCommand(919);

    public static final ClientScriptCommand field5428 = new ClientScriptCommand(767);

    public static final ClientScriptCommand field5429 = new ClientScriptCommand(631);

    public static final ClientScriptCommand field5197 = new ClientScriptCommand(196);

    public static final ClientScriptCommand field5431 = new ClientScriptCommand(934);

    public static final ClientScriptCommand field5432 = new ClientScriptCommand(407);

    public static final ClientScriptCommand field5282 = new ClientScriptCommand(1226);

    public static final ClientScriptCommand field5652 = new ClientScriptCommand(202);

    public static final ClientScriptCommand field5435 = new ClientScriptCommand(856);

    public static final ClientScriptCommand field5734 = new ClientScriptCommand(891);

    public static final ClientScriptCommand field5437 = new ClientScriptCommand(1265);

    public static final ClientScriptCommand field5438 = new ClientScriptCommand(1400);

    public static final ClientScriptCommand field5439 = new ClientScriptCommand(1307);

    public static final ClientScriptCommand field5440 = new ClientScriptCommand(724);

    public static final ClientScriptCommand field5700 = new ClientScriptCommand(509);

    public static final ClientScriptCommand field5442 = new ClientScriptCommand(1197);

    public static final ClientScriptCommand field6485 = new ClientScriptCommand(1230);

    public static final ClientScriptCommand field6437 = new ClientScriptCommand(575);

    public static final ClientScriptCommand field6472 = new ClientScriptCommand(255);

    public static final ClientScriptCommand _RETURN = new ClientScriptCommand(1349);

    public static final ClientScriptCommand field6450 = new ClientScriptCommand(236);

    public static final ClientScriptCommand field5933 = new ClientScriptCommand(756);

    public static final ClientScriptCommand field5449 = new ClientScriptCommand(1382);

    public static final ClientScriptCommand field6019 = new ClientScriptCommand(941);

    public static final ClientScriptCommand field5234 = new ClientScriptCommand(8);

    public static final ClientScriptCommand field5591 = new ClientScriptCommand(754);

    public static final ClientScriptCommand field6120 = new ClientScriptCommand(927);

    public static final ClientScriptCommand field5777 = new ClientScriptCommand(224);

    public static final ClientScriptCommand field5607 = new ClientScriptCommand(599);

    public static final ClientScriptCommand field6128 = new ClientScriptCommand(408);

    public static final ClientScriptCommand field5499 = new ClientScriptCommand(258);

    public static final ClientScriptCommand field6306 = new ClientScriptCommand(684);

    public static final ClientScriptCommand field5459 = new ClientScriptCommand(944);

    public static final ClientScriptCommand field5947 = new ClientScriptCommand(472);

    public static final ClientScriptCommand field5461 = new ClientScriptCommand(238);

    public static final ClientScriptCommand field5462 = new ClientScriptCommand(423);

    public static final ClientScriptCommand field6055 = new ClientScriptCommand(6);

    public static final ClientScriptCommand field5464 = new ClientScriptCommand(900);

    public static final ClientScriptCommand field5465 = new ClientScriptCommand(537);

    public static final ClientScriptCommand field5466 = new ClientScriptCommand(421);

    public static final ClientScriptCommand field5467 = new ClientScriptCommand(199);

    public static final ClientScriptCommand field5468 = new ClientScriptCommand(798);

    public static final ClientScriptCommand field5469 = new ClientScriptCommand(1268);

    public static final ClientScriptCommand field5470 = new ClientScriptCommand(387);

    public static final ClientScriptCommand field5747 = new ClientScriptCommand(552);

    public static final ClientScriptCommand field5472 = new ClientScriptCommand(1151);

    public static final ClientScriptCommand field5473 = new ClientScriptCommand(958);

    public static final ClientScriptCommand field5474 = new ClientScriptCommand(184);

    public static final ClientScriptCommand field5308 = new ClientScriptCommand(201);

    public static final ClientScriptCommand field5476 = new ClientScriptCommand(1420);

    public static final ClientScriptCommand field5477 = new ClientScriptCommand(1259);

    public static final ClientScriptCommand field5478 = new ClientScriptCommand(961);

    public static final ClientScriptCommand field5904 = new ClientScriptCommand(223);

    public static final ClientScriptCommand field5480 = new ClientScriptCommand(151);

    public static final ClientScriptCommand field6033 = new ClientScriptCommand(62);

    public static final ClientScriptCommand field5482 = new ClientScriptCommand(1411);

    public static final ClientScriptCommand field5483 = new ClientScriptCommand(171);

    public static final ClientScriptCommand field5484 = new ClientScriptCommand(703);

    public static final ClientScriptCommand field5157 = new ClientScriptCommand(770);

    public static final ClientScriptCommand field5218 = new ClientScriptCommand(1331);

    public static final ClientScriptCommand field5450 = new ClientScriptCommand(1156);

    public static final ClientScriptCommand field5259 = new ClientScriptCommand(868);

    public static final ClientScriptCommand field5489 = new ClientScriptCommand(1062);

    public static final ClientScriptCommand field5836 = new ClientScriptCommand(1110);

    public static final ClientScriptCommand field5491 = new ClientScriptCommand(571);

    public static final ClientScriptCommand field6442 = new ClientScriptCommand(264);

    public static final ClientScriptCommand field5556 = new ClientScriptCommand(37);

    public static final ClientScriptCommand field5494 = new ClientScriptCommand(1200);

    public static final ClientScriptCommand field6313 = new ClientScriptCommand(686);

    public static final ClientScriptCommand field5496 = new ClientScriptCommand(116);

    public static final ClientScriptCommand field5351 = new ClientScriptCommand(1343);

    public static final ClientScriptCommand field5264 = new ClientScriptCommand(142);

    public static final ClientScriptCommand field6385 = new ClientScriptCommand(511);

    public static final ClientScriptCommand field5500 = new ClientScriptCommand(992);

    public static final ClientScriptCommand field6309 = new ClientScriptCommand(304);

    public static final ClientScriptCommand field5502 = new ClientScriptCommand(140);

    public static final ClientScriptCommand field5731 = new ClientScriptCommand(1222);

    public static final ClientScriptCommand field5504 = new ClientScriptCommand(937);

    public static final ClientScriptCommand field5505 = new ClientScriptCommand(1368);

    public static final ClientScriptCommand field5855 = new ClientScriptCommand(657);

    public static final ClientScriptCommand field5507 = new ClientScriptCommand(279);

    public static final ClientScriptCommand field5233 = new ClientScriptCommand(812);

    public static final ClientScriptCommand field5509 = new ClientScriptCommand(488);

    public static final ClientScriptCommand field5510 = new ClientScriptCommand(658);

    public static final ClientScriptCommand field5511 = new ClientScriptCommand(615);

    public static final ClientScriptCommand field5512 = new ClientScriptCommand(211);

    public static final ClientScriptCommand field5513 = new ClientScriptCommand(289);

    public static final ClientScriptCommand field5612 = new ClientScriptCommand(1309);

    public static final ClientScriptCommand field5515 = new ClientScriptCommand(444);

    public static final ClientScriptCommand field5516 = new ClientScriptCommand(333);

    public static final ClientScriptCommand field5599 = new ClientScriptCommand(730);

    public static final ClientScriptCommand field6032 = new ClientScriptCommand(617);

    public static final ClientScriptCommand field5519 = new ClientScriptCommand(1238);

    public static final ClientScriptCommand field5520 = new ClientScriptCommand(814);

    public static final ClientScriptCommand field6215 = new ClientScriptCommand(520);

    public static final ClientScriptCommand field5522 = new ClientScriptCommand(1334);

    public static final ClientScriptCommand field5523 = new ClientScriptCommand(708);

    public static final ClientScriptCommand field6192 = new ClientScriptCommand(739);

    public static final ClientScriptCommand field5525 = new ClientScriptCommand(475);

    public static final ClientScriptCommand field6205 = new ClientScriptCommand(100);

    public static final ClientScriptCommand field5527 = new ClientScriptCommand(212);

    public static final ClientScriptCommand field5528 = new ClientScriptCommand(826);

    public static final ClientScriptCommand field6541 = new ClientScriptCommand(1047);

    public static final ClientScriptCommand field5530 = new ClientScriptCommand(762);

    public static final ClientScriptCommand field6155 = new ClientScriptCommand(1043);

    public static final ClientScriptCommand field5866 = new ClientScriptCommand(1263);

    public static final ClientScriptCommand field5533 = new ClientScriptCommand(916);

    public static final ClientScriptCommand field6173 = new ClientScriptCommand(670);

    public static final ClientScriptCommand field5323 = new ClientScriptCommand(517);

    public static final ClientScriptCommand field5536 = new ClientScriptCommand(996);

    public static final ClientScriptCommand field5537 = new ClientScriptCommand(1196);

    public static final ClientScriptCommand field5538 = new ClientScriptCommand(981);

    public static final ClientScriptCommand field6480 = new ClientScriptCommand(591);

    public static final ClientScriptCommand field5540 = new ClientScriptCommand(596);

    public static final ClientScriptCommand field5541 = new ClientScriptCommand(1418);

    public static final ClientScriptCommand field5542 = new ClientScriptCommand(516);

    public static final ClientScriptCommand field5455 = new ClientScriptCommand(1105);

    public static final ClientScriptCommand field5405 = new ClientScriptCommand(790);

    public static final ClientScriptCommand field5545 = new ClientScriptCommand(470);

    public static final ClientScriptCommand field5546 = new ClientScriptCommand(765);

    public static final ClientScriptCommand field6266 = new ClientScriptCommand(35);

    public static final ClientScriptCommand field5548 = new ClientScriptCommand(1258);

    public static final ClientScriptCommand field5549 = new ClientScriptCommand(671);

    public static final ClientScriptCommand field5550 = new ClientScriptCommand(1379);

    public static final ClientScriptCommand field5551 = new ClientScriptCommand(1378);

    public static final ClientScriptCommand field5880 = new ClientScriptCommand(47);

    public static final ClientScriptCommand field5553 = new ClientScriptCommand(1051);

    public static final ClientScriptCommand field5554 = new ClientScriptCommand(355);

    public static final ClientScriptCommand field5555 = new ClientScriptCommand(1065);

    public static final ClientScriptCommand field6153 = new ClientScriptCommand(1304);

    public static final ClientScriptCommand field5558 = new ClientScriptCommand(1236);

    public static final ClientScriptCommand field6232 = new ClientScriptCommand(1370);

    public static final ClientScriptCommand field5559 = new ClientScriptCommand(918);

    public static final ClientScriptCommand field5560 = new ClientScriptCommand(401);

    public static final ClientScriptCommand field5337 = new ClientScriptCommand(620);

    public static final ClientScriptCommand field5562 = new ClientScriptCommand(1106);

    public static final ClientScriptCommand field5563 = new ClientScriptCommand(793);

    public static final ClientScriptCommand field5342 = new ClientScriptCommand(130);

    public static final ClientScriptCommand field5565 = new ClientScriptCommand(471);

    public static final ClientScriptCommand field6157 = new ClientScriptCommand(404);

    public static final ClientScriptCommand field6330 = new ClientScriptCommand(1234);

    public static final ClientScriptCommand field5568 = new ClientScriptCommand(811);

    public static final ClientScriptCommand field5569 = new ClientScriptCommand(215);

    public static final ClientScriptCommand field5826 = new ClientScriptCommand(1384);

    public static final ClientScriptCommand field5571 = new ClientScriptCommand(1426);

    public static final ClientScriptCommand field5572 = new ClientScriptCommand(75);

    public static final ClientScriptCommand field5573 = new ClientScriptCommand(870);

    public static final ClientScriptCommand field6307 = new ClientScriptCommand(1254);

    public static final ClientScriptCommand field5902 = new ClientScriptCommand(514);

    public static final ClientScriptCommand field6172 = new ClientScriptCommand(26);

    public static final ClientScriptCommand field6452 = new ClientScriptCommand(1133);

    public static final ClientScriptCommand field5796 = new ClientScriptCommand(1082);

    public static final ClientScriptCommand field5310 = new ClientScriptCommand(73);

    public static final ClientScriptCommand field5580 = new ClientScriptCommand(53);

    public static final ClientScriptCommand field5581 = new ClientScriptCommand(160);

    public static final ClientScriptCommand field5582 = new ClientScriptCommand(786);

    public static final ClientScriptCommand field5583 = new ClientScriptCommand(1422);

    public static final ClientScriptCommand field5584 = new ClientScriptCommand(978);

    public static final ClientScriptCommand field5585 = new ClientScriptCommand(607);

    public static final ClientScriptCommand field5586 = new ClientScriptCommand(962);

    public static final ClientScriptCommand field6562 = new ClientScriptCommand(241);

    public static final ClientScriptCommand field5588 = new ClientScriptCommand(323);

    public static final ClientScriptCommand field5589 = new ClientScriptCommand(1127);

    public static final ClientScriptCommand field5590 = new ClientScriptCommand(1347);

    public static final ClientScriptCommand field5273 = new ClientScriptCommand(706);

    public static final ClientScriptCommand field5592 = new ClientScriptCommand(833);

    public static final ClientScriptCommand field6569 = new ClientScriptCommand(56);

    public static final ClientScriptCommand field5594 = new ClientScriptCommand(486);

    public static final ClientScriptCommand field5595 = new ClientScriptCommand(1135);

    public static final ClientScriptCommand field5596 = new ClientScriptCommand(265);

    public static final ClientScriptCommand field5722 = new ClientScriptCommand(1020);

    public static final ClientScriptCommand field5598 = new ClientScriptCommand(527);

    public static final ClientScriptCommand field6257 = new ClientScriptCommand(1290);

    public static final ClientScriptCommand field6058 = new ClientScriptCommand(562);

    public static final ClientScriptCommand field6376 = new ClientScriptCommand(1089);

    public static final ClientScriptCommand field6486 = new ClientScriptCommand(628);

    public static final ClientScriptCommand field5231 = new ClientScriptCommand(497);

    public static final ClientScriptCommand field5604 = new ClientScriptCommand(484);

    public static final ClientScriptCommand field5605 = new ClientScriptCommand(882);

    public static final ClientScriptCommand field5606 = new ClientScriptCommand(632);

    public static final ClientScriptCommand field5326 = new ClientScriptCommand(233);

    public static final ClientScriptCommand field6473 = new ClientScriptCommand(95);

    public static final ClientScriptCommand field6012 = new ClientScriptCommand(1429);

    public static final ClientScriptCommand field5998 = new ClientScriptCommand(634);

    public static final ClientScriptCommand field5245 = new ClientScriptCommand(1144);

    public static final ClientScriptCommand field5788 = new ClientScriptCommand(845);

    public static final ClientScriptCommand field5613 = new ClientScriptCommand(1032);

    public static final ClientScriptCommand field5614 = new ClientScriptCommand(462);

    public static final ClientScriptCommand field5188 = new ClientScriptCommand(384);

    public static final ClientScriptCommand field5341 = new ClientScriptCommand(963);

    public static final ClientScriptCommand field5617 = new ClientScriptCommand(1221);

    public static final ClientScriptCommand field5770 = new ClientScriptCommand(855);

    public static final ClientScriptCommand field5619 = new ClientScriptCommand(819);

    public static final ClientScriptCommand field5620 = new ClientScriptCommand(344);

    public static final ClientScriptCommand field5621 = new ClientScriptCommand(209);

    public static final ClientScriptCommand field5622 = new ClientScriptCommand(11);

    public static final ClientScriptCommand field5623 = new ClientScriptCommand(881);

    public static final ClientScriptCommand field5898 = new ClientScriptCommand(720);

    public static final ClientScriptCommand field5625 = new ClientScriptCommand(231);

    public static final ClientScriptCommand field5626 = new ClientScriptCommand(1145);

    public static final ClientScriptCommand field5576 = new ClientScriptCommand(801);

    public static final ClientScriptCommand field5628 = new ClientScriptCommand(290);

    public static final ClientScriptCommand field5658 = new ClientScriptCommand(463);

    public static final ClientScriptCommand field5630 = new ClientScriptCommand(234);

    public static final ClientScriptCommand field5631 = new ClientScriptCommand(501);

    public static final ClientScriptCommand field5632 = new ClientScriptCommand(568);

    public static final ClientScriptCommand field5288 = new ClientScriptCommand(415);

    public static final ClientScriptCommand field5634 = new ClientScriptCommand(925);

    public static final ClientScriptCommand field5776 = new ClientScriptCommand(573);

    public static final ClientScriptCommand field5636 = new ClientScriptCommand(850);

    public static final ClientScriptCommand field5616 = new ClientScriptCommand(717);

    public static final ClientScriptCommand field5638 = new ClientScriptCommand(244);

    public static final ClientScriptCommand field5639 = new ClientScriptCommand(1090);

    public static final ClientScriptCommand field5640 = new ClientScriptCommand(489);

    public static final ClientScriptCommand field5641 = new ClientScriptCommand(966);

    public static final ClientScriptCommand field5642 = new ClientScriptCommand(848);

    public static final ClientScriptCommand field6418 = new ClientScriptCommand(456);

    public static final ClientScriptCommand field5163 = new ClientScriptCommand(1086);

    public static final ClientScriptCommand field5645 = new ClientScriptCommand(656);

    public static final ClientScriptCommand field5646 = new ClientScriptCommand(594);

    public static final ClientScriptCommand field5647 = new ClientScriptCommand(805);

    public static final ClientScriptCommand field5648 = new ClientScriptCommand(1120);

    public static final ClientScriptCommand field5649 = new ClientScriptCommand(1361);

    public static final ClientScriptCommand field5650 = new ClientScriptCommand(903);

    public static final ClientScriptCommand field6154 = new ClientScriptCommand(1);

    public static final ClientScriptCommand field6084 = new ClientScriptCommand(1324);

    public static final ClientScriptCommand field5653 = new ClientScriptCommand(328);

    public static final ClientScriptCommand field5654 = new ClientScriptCommand(1408);

    public static final ClientScriptCommand field5655 = new ClientScriptCommand(1073);

    public static final ClientScriptCommand field5956 = new ClientScriptCommand(1176);

    public static final ClientScriptCommand field6499 = new ClientScriptCommand(1367);

    public static final ClientScriptCommand field6435 = new ClientScriptCommand(713);

    public static final ClientScriptCommand field5659 = new ClientScriptCommand(312);

    public static final ClientScriptCommand field6521 = new ClientScriptCommand(1017);

    public static final ClientScriptCommand field6056 = new ClientScriptCommand(653);

    public static final ClientScriptCommand field5662 = new ClientScriptCommand(1242);

    public static final ClientScriptCommand field5663 = new ClientScriptCommand(19);

    public static final ClientScriptCommand field6401 = new ClientScriptCommand(66);

    public static final ClientScriptCommand field5665 = new ClientScriptCommand(15);

    public static final ClientScriptCommand field5666 = new ClientScriptCommand(1009);

    public static final ClientScriptCommand field5667 = new ClientScriptCommand(1321);

    public static final ClientScriptCommand field6557 = new ClientScriptCommand(555);

    public static final ClientScriptCommand field5669 = new ClientScriptCommand(598);

    public static final ClientScriptCommand field5670 = new ClientScriptCommand(701);

    public static final ClientScriptCommand field6563 = new ClientScriptCommand(1431);

    public static final ClientScriptCommand field5672 = new ClientScriptCommand(1377);

    public static final ClientScriptCommand field5673 = new ClientScriptCommand(1323);

    public static final ClientScriptCommand field5566 = new ClientScriptCommand(313);

    public static final ClientScriptCommand field5675 = new ClientScriptCommand(479);

    public static final ClientScriptCommand field5676 = new ClientScriptCommand(429);

    public static final ClientScriptCommand field5677 = new ClientScriptCommand(976);

    public static final ClientScriptCommand field5278 = new ClientScriptCommand(329);

    public static final ClientScriptCommand field5679 = new ClientScriptCommand(109);

    public static final ClientScriptCommand field5208 = new ClientScriptCommand(375);

    public static final ClientScriptCommand field5681 = new ClientScriptCommand(1394);

    public static final ClientScriptCommand field5682 = new ClientScriptCommand(1148);

    public static final ClientScriptCommand field5172 = new ClientScriptCommand(1139);

    public static final ClientScriptCommand field5684 = new ClientScriptCommand(726);

    public static final ClientScriptCommand field5685 = new ClientScriptCommand(852);

    public static final ClientScriptCommand field5686 = new ClientScriptCommand(163);

    public static final ClientScriptCommand field5687 = new ClientScriptCommand(1096);

    public static final ClientScriptCommand field5688 = new ClientScriptCommand(1193);

    public static final ClientScriptCommand field5689 = new ClientScriptCommand(1246);

    public static final ClientScriptCommand field5690 = new ClientScriptCommand(65);

    public static final ClientScriptCommand field5249 = new ClientScriptCommand(728);

    public static final ClientScriptCommand field5692 = new ClientScriptCommand(621);

    public static final ClientScriptCommand field5693 = new ClientScriptCommand(818);

    public static final ClientScriptCommand field5694 = new ClientScriptCommand(662);

    public static final ClientScriptCommand field5695 = new ClientScriptCommand(946);

    public static final ClientScriptCommand field5696 = new ClientScriptCommand(1004);

    public static final ClientScriptCommand field5697 = new ClientScriptCommand(354);

    public static final ClientScriptCommand field5698 = new ClientScriptCommand(347);

    public static final ClientScriptCommand field5699 = new ClientScriptCommand(357);

    public static final ClientScriptCommand field5506 = new ClientScriptCommand(96);

    public static final ClientScriptCommand field5426 = new ClientScriptCommand(666);

    public static final ClientScriptCommand field5702 = new ClientScriptCommand(909);

    public static final ClientScriptCommand field6409 = new ClientScriptCommand(772);

    public static final ClientScriptCommand field6003 = new ClientScriptCommand(673);

    public static final ClientScriptCommand field5705 = new ClientScriptCommand(1155);

    public static final ClientScriptCommand field6372 = new ClientScriptCommand(1015);

    public static final ClientScriptCommand field5707 = new ClientScriptCommand(340);

    public static final ClientScriptCommand field5708 = new ClientScriptCommand(1119);

    public static final ClientScriptCommand field5709 = new ClientScriptCommand(806);

    public static final ClientScriptCommand field5710 = new ClientScriptCommand(522);

    public static final ClientScriptCommand field5711 = new ClientScriptCommand(986);

    public static final ClientScriptCommand field5888 = new ClientScriptCommand(1123);

    public static final ClientScriptCommand field5713 = new ClientScriptCommand(449);

    public static final ClientScriptCommand field5767 = new ClientScriptCommand(44);

    public static final ClientScriptCommand field5715 = new ClientScriptCommand(70);

    public static final ClientScriptCommand field5716 = new ClientScriptCommand(764);

    public static final ClientScriptCommand field5717 = new ClientScriptCommand(748);

    public static final ClientScriptCommand field5718 = new ClientScriptCommand(1040);

    public static final ClientScriptCommand field5719 = new ClientScriptCommand(441);

    public static final ClientScriptCommand field5327 = new ClientScriptCommand(43);

    public static final ClientScriptCommand field5721 = new ClientScriptCommand(1138);

    public static final ClientScriptCommand field5399 = new ClientScriptCommand(860);

    public static final ClientScriptCommand field6501 = new ClientScriptCommand(72);

    public static final ClientScriptCommand field5724 = new ClientScriptCommand(439);

    public static final ClientScriptCommand field5725 = new ClientScriptCommand(876);

    public static final ClientScriptCommand field6103 = new ClientScriptCommand(1131);

    public static final ClientScriptCommand field5727 = new ClientScriptCommand(216);

    public static final ClientScriptCommand field5185 = new ClientScriptCommand(1041);

    public static final ClientScriptCommand field5644 = new ClientScriptCommand(128);

    public static final ClientScriptCommand field5730 = new ClientScriptCommand(284);

    public static final ClientScriptCommand field6436 = new ClientScriptCommand(917);

    public static final ClientScriptCommand field5750 = new ClientScriptCommand(339);

    public static final ClientScriptCommand field5272 = new ClientScriptCommand(108);

    public static final ClientScriptCommand field5543 = new ClientScriptCommand(672);

    public static final ClientScriptCommand field5735 = new ClientScriptCommand(960);

    public static final ClientScriptCommand field6556 = new ClientScriptCommand(889);

    public static final ClientScriptCommand field5737 = new ClientScriptCommand(1272);

    public static final ClientScriptCommand field5738 = new ClientScriptCommand(1021);

    public static final ClientScriptCommand field5179 = new ClientScriptCommand(1202);

    public static final ClientScriptCommand field5740 = new ClientScriptCommand(619);

    public static final ClientScriptCommand field5741 = new ClientScriptCommand(133);

    public static final ClientScriptCommand field6427 = new ClientScriptCommand(1085);

    public static final ClientScriptCommand field5743 = new ClientScriptCommand(1427);

    public static final ClientScriptCommand field5852 = new ClientScriptCommand(252);

    public static final ClientScriptCommand field6068 = new ClientScriptCommand(1239);

    public static final ClientScriptCommand field5674 = new ClientScriptCommand(550);

    public static final ClientScriptCommand field6438 = new ClientScriptCommand(704);

    public static final ClientScriptCommand field5748 = new ClientScriptCommand(254);

    public static final ClientScriptCommand field5749 = new ClientScriptCommand(115);

    public static final ClientScriptCommand field5794 = new ClientScriptCommand(782);

    public static final ClientScriptCommand field5751 = new ClientScriptCommand(508);

    public static final ClientScriptCommand field5756 = new ClientScriptCommand(1101);

    public static final ClientScriptCommand field5753 = new ClientScriptCommand(1000);

    public static final ClientScriptCommand field5754 = new ClientScriptCommand(400);

    public static final ClientScriptCommand field5755 = new ClientScriptCommand(906);

    public static final ClientScriptCommand field5925 = new ClientScriptCommand(1357);

    public static final ClientScriptCommand field5757 = new ClientScriptCommand(1256);

    public static final ClientScriptCommand field5758 = new ClientScriptCommand(712);

    public static final ClientScriptCommand field5848 = new ClientScriptCommand(1084);

    public static final ClientScriptCommand field6197 = new ClientScriptCommand(358);

    public static final ClientScriptCommand field5761 = new ClientScriptCommand(1214);

    public static final ClientScriptCommand field5762 = new ClientScriptCommand(168);

    public static final ClientScriptCommand field5763 = new ClientScriptCommand(32);

    public static final ClientScriptCommand field5764 = new ClientScriptCommand(63);

    public static final ClientScriptCommand field5765 = new ClientScriptCommand(884);

    public static final ClientScriptCommand field5766 = new ClientScriptCommand(455);

    public static final ClientScriptCommand field6474 = new ClientScriptCommand(52);

    public static final ClientScriptCommand field5768 = new ClientScriptCommand(1308);

    public static final ClientScriptCommand field5769 = new ClientScriptCommand(654);

    public static final ClientScriptCommand field5726 = new ClientScriptCommand(541);

    public static final ClientScriptCommand field5771 = new ClientScriptCommand(931);

    public static final ClientScriptCommand field5772 = new ClientScriptCommand(838);

    public static final ClientScriptCommand field5773 = new ClientScriptCommand(459);

    public static final ClientScriptCommand field5774 = new ClientScriptCommand(260);

    public static final ClientScriptCommand field5775 = new ClientScriptCommand(580);

    public static final ClientScriptCommand field5242 = new ClientScriptCommand(1362);

    public static final ClientScriptCommand field6083 = new ClientScriptCommand(600);

    public static final ClientScriptCommand field5778 = new ClientScriptCommand(1216);

    public static final ClientScriptCommand field5779 = new ClientScriptCommand(296);

    public static final ClientScriptCommand field5609 = new ClientScriptCommand(1136);

    public static final ClientScriptCommand field5471 = new ClientScriptCommand(403);

    public static final ClientScriptCommand field5782 = new ClientScriptCommand(674);

    public static final ClientScriptCommand field6152 = new ClientScriptCommand(800);

    public static final ClientScriptCommand field5784 = new ClientScriptCommand(873);

    public static final ClientScriptCommand field6130 = new ClientScriptCommand(431);

    public static final ClientScriptCommand field5786 = new ClientScriptCommand(563);

    public static final ClientScriptCommand field5787 = new ClientScriptCommand(570);

    public static final ClientScriptCommand field5661 = new ClientScriptCommand(1257);

    public static final ClientScriptCommand field5789 = new ClientScriptCommand(208);

    public static final ClientScriptCommand field5790 = new ClientScriptCommand(1134);

    public static final ClientScriptCommand field5791 = new ClientScriptCommand(893);

    public static final ClientScriptCommand field5637 = new ClientScriptCommand(203);

    public static final ClientScriptCommand field6273 = new ClientScriptCommand(1289);

    public static final ClientScriptCommand field5486 = new ClientScriptCommand(745);

    public static final ClientScriptCommand field5795 = new ClientScriptCommand(1179);

    public static final ClientScriptCommand field5981 = new ClientScriptCommand(1423);

    public static final ClientScriptCommand field5561 = new ClientScriptCommand(320);

    public static final ClientScriptCommand field5798 = new ClientScriptCommand(988);

    public static final ClientScriptCommand field5799 = new ClientScriptCommand(394);

    public static final ClientScriptCommand field5800 = new ClientScriptCommand(86);

    public static final ClientScriptCommand field5835 = new ClientScriptCommand(22);

    public static final ClientScriptCommand field5971 = new ClientScriptCommand(705);

    public static final ClientScriptCommand field5803 = new ClientScriptCommand(427);

    public static final ClientScriptCommand field5804 = new ClientScriptCommand(1070);

    public static final ClientScriptCommand field5805 = new ClientScriptCommand(977);

    public static final ClientScriptCommand field5678 = new ClientScriptCommand(523);

    public static final ClientScriptCommand field5807 = new ClientScriptCommand(810);

    public static final ClientScriptCommand field5808 = new ClientScriptCommand(331);

    public static final ClientScriptCommand field5809 = new ClientScriptCommand(566);

    public static final ClientScriptCommand field5810 = new ClientScriptCommand(667);

    public static final ClientScriptCommand field5811 = new ClientScriptCommand(646);

    public static final ClientScriptCommand field5812 = new ClientScriptCommand(1126);

    public static final ClientScriptCommand field5813 = new ClientScriptCommand(191);

    public static final ClientScriptCommand field5814 = new ClientScriptCommand(699);

    public static final ClientScriptCommand field5815 = new ClientScriptCommand(136);

    public static final ClientScriptCommand field5816 = new ClientScriptCommand(683);

    public static final ClientScriptCommand field5378 = new ClientScriptCommand(351);

    public static final ClientScriptCommand field5818 = new ClientScriptCommand(305);

    public static final ClientScriptCommand field5819 = new ClientScriptCommand(1035);

    public static final ClientScriptCommand field5820 = new ClientScriptCommand(1330);

    public static final ClientScriptCommand field6219 = new ClientScriptCommand(1102);

    public static final ClientScriptCommand field5397 = new ClientScriptCommand(1149);

    public static final ClientScriptCommand field5823 = new ClientScriptCommand(774);

    public static final ClientScriptCommand field5824 = new ClientScriptCommand(1369);

    public static final ClientScriptCommand field6001 = new ClientScriptCommand(558);

    public static final ClientScriptCommand field5712 = new ClientScriptCommand(1326);

    public static final ClientScriptCommand field5827 = new ClientScriptCommand(402);

    public static final ClientScriptCommand field5828 = new ClientScriptCommand(14);

    public static final ClientScriptCommand field5829 = new ClientScriptCommand(126);

    public static final ClientScriptCommand field5830 = new ClientScriptCommand(500);

    public static final ClientScriptCommand field6244 = new ClientScriptCommand(422);

    public static final ClientScriptCommand field5281 = new ClientScriptCommand(872);

    public static final ClientScriptCommand field5531 = new ClientScriptCommand(1397);

    public static final ClientScriptCommand field5831 = new ClientScriptCommand(559);

    public static final ClientScriptCommand field6531 = new ClientScriptCommand(359);

    public static final ClientScriptCommand field5535 = new ClientScriptCommand(277);

    public static final ClientScriptCommand field6225 = new ClientScriptCommand(190);

    public static final ClientScriptCommand field5838 = new ClientScriptCommand(789);

    public static final ClientScriptCommand field6261 = new ClientScriptCommand(1392);

    public static final ClientScriptCommand field5840 = new ClientScriptCommand(1337);

    public static final ClientScriptCommand field5841 = new ClientScriptCommand(30);

    public static final ClientScriptCommand field5842 = new ClientScriptCommand(1301);

    public static final ClientScriptCommand field5843 = new ClientScriptCommand(346);

    public static final ClientScriptCommand field6199 = new ClientScriptCommand(1194);

    public static final ClientScriptCommand field5845 = new ClientScriptCommand(723);

    public static final ClientScriptCommand field6571 = new ClientScriptCommand(148);

    public static final ClientScriptCommand field5793 = new ClientScriptCommand(626);

    public static final ClientScriptCommand field5456 = new ClientScriptCommand(503);

    public static final ClientScriptCommand field5875 = new ClientScriptCommand(757);

    public static final ClientScriptCommand field6367 = new ClientScriptCommand(874);

    public static final ClientScriptCommand field6500 = new ClientScriptCommand(1339);

    public static final ClientScriptCommand field6341 = new ClientScriptCommand(1169);

    public static final ClientScriptCommand field5853 = new ClientScriptCommand(933);

    public static final ClientScriptCommand field5854 = new ClientScriptCommand(24);

    public static final ClientScriptCommand field6475 = new ClientScriptCommand(172);

    public static final ClientScriptCommand field5856 = new ClientScriptCommand(381);

    public static final ClientScriptCommand field5857 = new ClientScriptCommand(624);

    public static final ClientScriptCommand field5858 = new ClientScriptCommand(639);

    public static final ClientScriptCommand field5859 = new ClientScriptCommand(871);

    public static final ClientScriptCommand field5746 = new ClientScriptCommand(135);

    public static final ClientScriptCommand field6182 = new ClientScriptCommand(581);

    public static final ClientScriptCommand field6159 = new ClientScriptCommand(368);

    public static final ClientScriptCommand field5177 = new ClientScriptCommand(219);

    public static final ClientScriptCommand field5864 = new ClientScriptCommand(307);

    public static final ClientScriptCommand field5865 = new ClientScriptCommand(1281);

    public static final ClientScriptCommand field6277 = new ClientScriptCommand(1113);

    public static final ClientScriptCommand field5487 = new ClientScriptCommand(1165);

    public static final ClientScriptCommand field5534 = new ClientScriptCommand(1287);

    public static final ClientScriptCommand field5869 = new ClientScriptCommand(1261);

    public static final ClientScriptCommand field5870 = new ClientScriptCommand(1243);

    public static final ClientScriptCommand field5871 = new ClientScriptCommand(55);

    public static final ClientScriptCommand field6520 = new ClientScriptCommand(478);

    public static final ClientScriptCommand field5873 = new ClientScriptCommand(557);

    public static final ClientScriptCommand field6206 = new ClientScriptCommand(406);

    public static final ClientScriptCommand field5402 = new ClientScriptCommand(804);

    public static final ClientScriptCommand field5547 = new ClientScriptCommand(1046);

    public static final ClientScriptCommand field5877 = new ClientScriptCommand(1223);

    public static final ClientScriptCommand field5878 = new ClientScriptCommand(1025);

    public static final ClientScriptCommand field6448 = new ClientScriptCommand(928);

    public static final ClientScriptCommand field5418 = new ClientScriptCommand(1080);

    public static final ClientScriptCommand field5881 = new ClientScriptCommand(113);

    public static final ClientScriptCommand field6413 = new ClientScriptCommand(152);

    public static final ClientScriptCommand field5883 = new ClientScriptCommand(192);

    public static final ClientScriptCommand field5884 = new ClientScriptCommand(899);

    public static final ClientScriptCommand field6542 = new ClientScriptCommand(1056);

    public static final ClientScriptCommand field5886 = new ClientScriptCommand(1081);

    public static final ClientScriptCommand field5887 = new ClientScriptCommand(859);

    public static final ClientScriptCommand field5872 = new ClientScriptCommand(165);

    public static final ClientScriptCommand field5889 = new ClientScriptCommand(869);

    public static final ClientScriptCommand field5874 = new ClientScriptCommand(586);

    public static final ClientScriptCommand field5891 = new ClientScriptCommand(921);

    public static final ClientScriptCommand field5333 = new ClientScriptCommand(1375);

    public static final ClientScriptCommand field5893 = new ClientScriptCommand(787);

    public static final ClientScriptCommand field5894 = new ClientScriptCommand(1142);

    public static final ClientScriptCommand field6284 = new ClientScriptCommand(235);

    public static final ClientScriptCommand field5896 = new ClientScriptCommand(504);

    public static final ClientScriptCommand field5897 = new ClientScriptCommand(274);

    public static final ClientScriptCommand field6359 = new ClientScriptCommand(1099);

    public static final ClientScriptCommand field5899 = new ClientScriptCommand(823);

    public static final ClientScriptCommand field5900 = new ClientScriptCommand(1069);

    public static final ClientScriptCommand field5901 = new ClientScriptCommand(799);

    public static final ClientScriptCommand field5201 = new ClientScriptCommand(655);

    public static final ClientScriptCommand field5903 = new ClientScriptCommand(997);

    public static final ClientScriptCommand field6168 = new ClientScriptCommand(590);

    public static final ClientScriptCommand field5974 = new ClientScriptCommand(967);

    public static final ClientScriptCommand field5906 = new ClientScriptCommand(17);

    public static final ClientScriptCommand field5907 = new ClientScriptCommand(951);

    public static final ClientScriptCommand field5908 = new ClientScriptCommand(1039);

    public static final ClientScriptCommand field5151 = new ClientScriptCommand(533);

    public static final ClientScriptCommand field5910 = new ClientScriptCommand(134);

    public static final ClientScriptCommand field5911 = new ClientScriptCommand(1299);

    public static final ClientScriptCommand field5912 = new ClientScriptCommand(67);

    public static final ClientScriptCommand field5913 = new ClientScriptCommand(125);

    public static final ClientScriptCommand field5992 = new ClientScriptCommand(1180);

    public static final ClientScriptCommand field5915 = new ClientScriptCommand(539);

    public static final ClientScriptCommand field5916 = new ClientScriptCommand(1181);

    public static final ClientScriptCommand field5917 = new ClientScriptCommand(300);

    public static final ClientScriptCommand field5895 = new ClientScriptCommand(45);

    public static final ClientScriptCommand field5919 = new ClientScriptCommand(1014);

    public static final ClientScriptCommand field5920 = new ClientScriptCommand(766);

    public static final ClientScriptCommand field5921 = new ClientScriptCommand(758);

    public static final ClientScriptCommand field5922 = new ClientScriptCommand(1072);

    public static final ClientScriptCommand field5923 = new ClientScriptCommand(836);

    public static final ClientScriptCommand field5316 = new ClientScriptCommand(528);

    public static final ClientScriptCommand field6260 = new ClientScriptCommand(364);

    public static final ClientScriptCommand field6285 = new ClientScriptCommand(506);

    public static final ClientScriptCommand field5927 = new ClientScriptCommand(1016);

    public static final ClientScriptCommand field5928 = new ClientScriptCommand(58);

    public static final ClientScriptCommand field5929 = new ClientScriptCommand(442);

    public static final ClientScriptCommand field6509 = new ClientScriptCommand(389);

    public static final ClientScriptCommand field5395 = new ClientScriptCommand(888);

    public static final ClientScriptCommand field5932 = new ClientScriptCommand(122);

    public static final ClientScriptCommand field6432 = new ClientScriptCommand(1373);

    public static final ClientScriptCommand field6086 = new ClientScriptCommand(635);

    public static final ClientScriptCommand field5935 = new ClientScriptCommand(1380);

    public static final ClientScriptCommand field5936 = new ClientScriptCommand(1359);

    public static final ClientScriptCommand field5577 = new ClientScriptCommand(60);

    public static final ClientScriptCommand field5938 = new ClientScriptCommand(1100);

    public static final ClientScriptCommand field5939 = new ClientScriptCommand(842);

    public static final ClientScriptCommand field5940 = new ClientScriptCommand(27);

    public static final ClientScriptCommand field5941 = new ClientScriptCommand(253);

    public static final ClientScriptCommand field5369 = new ClientScriptCommand(197);

    public static final ClientScriptCommand field5943 = new ClientScriptCommand(816);

    public static final ClientScriptCommand field5944 = new ClientScriptCommand(251);

    public static final ClientScriptCommand field5945 = new ClientScriptCommand(473);

    public static final ClientScriptCommand field5946 = new ClientScriptCommand(1027);

    public static final ClientScriptCommand field5524 = new ClientScriptCommand(349);

    public static final ClientScriptCommand field5948 = new ClientScriptCommand(1416);

    public static final ClientScriptCommand field5949 = new ClientScriptCommand(154);

    public static final ClientScriptCommand field5950 = new ClientScriptCommand(1345);

    public static final ClientScriptCommand field5951 = new ClientScriptCommand(495);

    public static final ClientScriptCommand field5797 = new ClientScriptCommand(1141);

    public static final ClientScriptCommand field6126 = new ClientScriptCommand(93);

    public static final ClientScriptCommand field5954 = new ClientScriptCommand(732);

    public static final ClientScriptCommand field5955 = new ClientScriptCommand(1146);

    public static final ClientScriptCommand field5220 = new ClientScriptCommand(1158);

    public static final ClientScriptCommand field5957 = new ClientScriptCommand(322);

    public static final ClientScriptCommand field5958 = new ClientScriptCommand(1273);

    public static final ClientScriptCommand field5959 = new ClientScriptCommand(695);

    public static final ClientScriptCommand field5960 = new ClientScriptCommand(663);

    public static final ClientScriptCommand field5961 = new ClientScriptCommand(521);

    public static final ClientScriptCommand field6382 = new ClientScriptCommand(167);

    public static final ClientScriptCommand field5963 = new ClientScriptCommand(1252);

    public static final ClientScriptCommand field5370 = new ClientScriptCommand(689);

    public static final ClientScriptCommand field5965 = new ClientScriptCommand(606);

    public static final ClientScriptCommand field6210 = new ClientScriptCommand(121);

    public static final ClientScriptCommand field5967 = new ClientScriptCommand(1183);

    public static final ClientScriptCommand field5968 = new ClientScriptCommand(382);

    public static final ClientScriptCommand field5969 = new ClientScriptCommand(913);

    public static final ClientScriptCommand field5970 = new ClientScriptCommand(1364);

    public static final ClientScriptCommand field6403 = new ClientScriptCommand(858);

    public static final ClientScriptCommand field5972 = new ClientScriptCommand(182);

    public static final ClientScriptCommand field5973 = new ClientScriptCommand(28);

    public static final ClientScriptCommand field5564 = new ClientScriptCommand(221);

    public static final ClientScriptCommand field5975 = new ClientScriptCommand(89);

    public static final ClientScriptCommand field5976 = new ClientScriptCommand(370);

    public static final ClientScriptCommand field5977 = new ClientScriptCommand(1217);

    public static final ClientScriptCommand field5978 = new ClientScriptCommand(87);

    public static final ClientScriptCommand field5979 = new ClientScriptCommand(1162);

    public static final ClientScriptCommand field5980 = new ClientScriptCommand(39);

    public static final ClientScriptCommand field5624 = new ClientScriptCommand(1390);

    public static final ClientScriptCommand field5982 = new ClientScriptCommand(413);

    public static final ClientScriptCommand field5983 = new ClientScriptCommand(828);

    public static final ClientScriptCommand field5186 = new ClientScriptCommand(1019);

    public static final ClientScriptCommand field5985 = new ClientScriptCommand(1383);

    public static final ClientScriptCommand field5986 = new ClientScriptCommand(820);

    public static final ClientScriptCommand field5987 = new ClientScriptCommand(1266);

    public static final ClientScriptCommand field6429 = new ClientScriptCommand(843);

    public static final ClientScriptCommand field5989 = new ClientScriptCommand(824);

    public static final ClientScriptCommand field5990 = new ClientScriptCommand(809);

    public static final ClientScriptCommand field5744 = new ClientScriptCommand(380);

    public static final ClientScriptCommand field5822 = new ClientScriptCommand(908);

    public static final ClientScriptCommand field5781 = new ClientScriptCommand(1168);

    public static final ClientScriptCommand field5312 = new ClientScriptCommand(1329);

    public static final ClientScriptCommand field6140 = new ClientScriptCommand(930);

    public static final ClientScriptCommand field5996 = new ClientScriptCommand(303);

    public static final ClientScriptCommand field5997 = new ClientScriptCommand(445);

    public static final ClientScriptCommand field6005 = new ClientScriptCommand(750);

    public static final ClientScriptCommand field5999 = new ClientScriptCommand(266);

    public static final ClientScriptCommand field6000 = new ClientScriptCommand(1410);

    public static final ClientScriptCommand field6462 = new ClientScriptCommand(4);

    public static final ClientScriptCommand field6002 = new ClientScriptCommand(1098);

    public static final ClientScriptCommand field5301 = new ClientScriptCommand(957);

    public static final ClientScriptCommand field5292 = new ClientScriptCommand(1312);

    public static final ClientScriptCommand field5627 = new ClientScriptCommand(894);

    public static final ClientScriptCommand field6006 = new ClientScriptCommand(1074);

    public static final ClientScriptCommand field6007 = new ClientScriptCommand(741);

    public static final ClientScriptCommand field6008 = new ClientScriptCommand(1282);

    public static final ClientScriptCommand field6009 = new ClientScriptCommand(1115);

    public static final ClientScriptCommand field6010 = new ClientScriptCommand(1353);

    public static final ClientScriptCommand field6011 = new ClientScriptCommand(1298);

    public static final ClientScriptCommand field5703 = new ClientScriptCommand(206);

    public static final ClientScriptCommand field5377 = new ClientScriptCommand(367);

    public static final ClientScriptCommand field6014 = new ClientScriptCommand(569);

    public static final ClientScriptCommand field6015 = new ClientScriptCommand(661);

    public static final ClientScriptCommand field6016 = new ClientScriptCommand(119);

    public static final ClientScriptCommand field6017 = new ClientScriptCommand(982);

    public static final ClientScriptCommand field6228 = new ClientScriptCommand(863);

    public static final ClientScriptCommand field5152 = new ClientScriptCommand(886);

    public static final ClientScriptCommand field5192 = new ClientScriptCommand(652);

    public static final ClientScriptCommand field6021 = new ClientScriptCommand(1264);

    public static final ClientScriptCommand field6022 = new ClientScriptCommand(390);

    public static final ClientScriptCommand field6023 = new ClientScriptCommand(379);

    public static final ClientScriptCommand field6024 = new ClientScriptCommand(487);

    public static final ClientScriptCommand field6025 = new ClientScriptCommand(46);

    public static final ClientScriptCommand field6026 = new ClientScriptCommand(1350);

    public static final ClientScriptCommand field6027 = new ClientScriptCommand(1060);

    public static final ClientScriptCommand field5384 = new ClientScriptCommand(862);

    public static final ClientScriptCommand field6029 = new ClientScriptCommand(920);

    public static final ClientScriptCommand field6030 = new ClientScriptCommand(1190);

    public static final ClientScriptCommand field6031 = new ClientScriptCommand(1064);

    public static final ClientScriptCommand field6088 = new ClientScriptCommand(214);

    public static final ClientScriptCommand field5396 = new ClientScriptCommand(161);

    public static final ClientScriptCommand field6034 = new ClientScriptCommand(700);

    public static final ClientScriptCommand field6035 = new ClientScriptCommand(106);

    public static final ClientScriptCommand field6036 = new ClientScriptCommand(1186);

    public static final ClientScriptCommand field6037 = new ClientScriptCommand(366);

    public static final ClientScriptCommand field6038 = new ClientScriptCommand(1305);

    public static final ClientScriptCommand field6039 = new ClientScriptCommand(293);

    public static final ClientScriptCommand field5398 = new ClientScriptCommand(560);

    public static final ClientScriptCommand field6380 = new ClientScriptCommand(7);

    public static final ClientScriptCommand field6167 = new ClientScriptCommand(434);

    public static final ClientScriptCommand field6043 = new ClientScriptCommand(409);

    public static final ClientScriptCommand field6044 = new ClientScriptCommand(138);

    public static final ClientScriptCommand field6045 = new ClientScriptCommand(1372);

    public static final ClientScriptCommand field6046 = new ClientScriptCommand(1430);

    public static final ClientScriptCommand field6410 = new ClientScriptCommand(955);

    public static final ClientScriptCommand field6048 = new ClientScriptCommand(747);

    public static final ClientScriptCommand field6049 = new ClientScriptCommand(227);

    public static final ClientScriptCommand field6050 = new ClientScriptCommand(156);

    public static final ClientScriptCommand field6051 = new ClientScriptCommand(283);

    public static final ClientScriptCommand field5265 = new ClientScriptCommand(417);

    public static final ClientScriptCommand field6053 = new ClientScriptCommand(952);

    public static final ClientScriptCommand field6054 = new ClientScriptCommand(207);

    public static final ClientScriptCommand field5760 = new ClientScriptCommand(1294);

    public static final ClientScriptCommand field6170 = new ClientScriptCommand(975);

    public static final ClientScriptCommand field6057 = new ClientScriptCommand(1319);

    public static final ClientScriptCommand field6549 = new ClientScriptCommand(1185);

    public static final ClientScriptCommand field6059 = new ClientScriptCommand(1067);

    public static final ClientScriptCommand field5460 = new ClientScriptCommand(681);

    public static final ClientScriptCommand field5704 = new ClientScriptCommand(217);

    public static final ClientScriptCommand field6062 = new ClientScriptCommand(1313);

    public static final ClientScriptCommand field6467 = new ClientScriptCommand(164);

    public static final ClientScriptCommand field6270 = new ClientScriptCommand(1210);

    public static final ClientScriptCommand field6065 = new ClientScriptCommand(1404);

    public static final ClientScriptCommand field5615 = new ClientScriptCommand(1211);

    public static final ClientScriptCommand field6067 = new ClientScriptCommand(536);

    public static final ClientScriptCommand field5608 = new ClientScriptCommand(232);

    public static final ClientScriptCommand field6069 = new ClientScriptCommand(618);

    public static final ClientScriptCommand field6070 = new ClientScriptCommand(145);

    public static final ClientScriptCommand field5728 = new ClientScriptCommand(1173);

    public static final ClientScriptCommand field6335 = new ClientScriptCommand(567);

    public static final ClientScriptCommand field6073 = new ClientScriptCommand(642);

    public static final ClientScriptCommand field6074 = new ClientScriptCommand(218);

    public static final ClientScriptCommand field6075 = new ClientScriptCommand(104);

    public static final ClientScriptCommand field6076 = new ClientScriptCommand(112);

    public static final ClientScriptCommand field6077 = new ClientScriptCommand(813);

    public static final ClientScriptCommand field6078 = new ClientScriptCommand(173);

    public static final ClientScriptCommand field6079 = new ClientScriptCommand(625);

    public static final ClientScriptCommand field6080 = new ClientScriptCommand(1125);

    public static final ClientScriptCommand field6081 = new ClientScriptCommand(272);

    public static final ClientScriptCommand field6082 = new ClientScriptCommand(1063);

    public static final ClientScriptCommand field5492 = new ClientScriptCommand(595);

    public static final ClientScriptCommand field5914 = new ClientScriptCommand(1054);

    public static final ClientScriptCommand field6085 = new ClientScriptCommand(257);

    public static final ClientScriptCommand field5876 = new ClientScriptCommand(771);

    public static final ClientScriptCommand field5570 = new ClientScriptCommand(785);

    public static final ClientScriptCommand field5834 = new ClientScriptCommand(1195);

    public static final ClientScriptCommand field6089 = new ClientScriptCommand(1178);

    public static final ClientScriptCommand field6090 = new ClientScriptCommand(572);

    public static final ClientScriptCommand field5603 = new ClientScriptCommand(1058);

    public static final ClientScriptCommand field6092 = new ClientScriptCommand(1366);

    public static final ClientScriptCommand field6093 = new ClientScriptCommand(178);

    public static final ClientScriptCommand field6094 = new ClientScriptCommand(363);

    public static final ClientScriptCommand field6095 = new ClientScriptCommand(938);

    public static final ClientScriptCommand field5322 = new ClientScriptCommand(1414);

    public static final ClientScriptCommand field5991 = new ClientScriptCommand(638);

    public static final ClientScriptCommand field6098 = new ClientScriptCommand(1295);

    public static final ClientScriptCommand field6099 = new ClientScriptCommand(777);

    public static final ClientScriptCommand field6100 = new ClientScriptCommand(297);

    public static final ClientScriptCommand field6101 = new ClientScriptCommand(248);

    public static final ClientScriptCommand field6102 = new ClientScriptCommand(1385);

    public static final ClientScriptCommand field5444 = new ClientScriptCommand(857);

    public static final ClientScriptCommand field6561 = new ClientScriptCommand(111);

    public static final ClientScriptCommand field6105 = new ClientScriptCommand(795);

    public static final ClientScriptCommand field6106 = new ClientScriptCommand(822);

    public static final ClientScriptCommand field6107 = new ClientScriptCommand(753);

    public static final ClientScriptCommand field6108 = new ClientScriptCommand(342);

    public static final ClientScriptCommand field6109 = new ClientScriptCommand(282);

    public static final ClientScriptCommand field6186 = new ClientScriptCommand(1415);

    public static final ClientScriptCommand field6111 = new ClientScriptCommand(1245);

    public static final ClientScriptCommand field6112 = new ClientScriptCommand(200);

    public static final ClientScriptCommand field6113 = new ClientScriptCommand(448);

    public static final ClientScriptCommand field6258 = new ClientScriptCommand(1088);

    public static final ClientScriptCommand field5802 = new ClientScriptCommand(947);

    public static final ClientScriptCommand field6110 = new ClientScriptCommand(1225);

    public static final ClientScriptCommand field6117 = new ClientScriptCommand(139);

    public static final ClientScriptCommand field6118 = new ClientScriptCommand(910);

    public static final ClientScriptCommand field6119 = new ClientScriptCommand(310);

    public static final ClientScriptCommand field6374 = new ClientScriptCommand(1316);

    public static final ClientScriptCommand field6121 = new ClientScriptCommand(783);

    public static final ClientScriptCommand field6122 = new ClientScriptCommand(1229);

    public static final ClientScriptCommand field5739 = new ClientScriptCommand(1412);

    public static final ClientScriptCommand field6124 = new ClientScriptCommand(553);

    public static final ClientScriptCommand field6125 = new ClientScriptCommand(690);

    public static final ClientScriptCommand field5618 = new ClientScriptCommand(1095);

    public static final ClientScriptCommand field6127 = new ClientScriptCommand(640);

    public static final ClientScriptCommand field5490 = new ClientScriptCommand(971);

    public static final ClientScriptCommand field6129 = new ClientScriptCommand(721);

    public static final ClientScriptCommand field5643 = new ClientScriptCommand(885);

    public static final ClientScriptCommand field6131 = new ClientScriptCommand(175);

    public static final ClientScriptCommand field6132 = new ClientScriptCommand(510);

    public static final ClientScriptCommand field6133 = new ClientScriptCommand(993);

    public static final ClientScriptCommand field6134 = new ClientScriptCommand(711);

    public static final ClientScriptCommand field6135 = new ClientScriptCommand(1344);

    public static final ClientScriptCommand field6136 = new ClientScriptCommand(817);

    public static final ClientScriptCommand field6137 = new ClientScriptCommand(315);

    public static final ClientScriptCommand field6138 = new ClientScriptCommand(867);

    public static final ClientScriptCommand field6139 = new ClientScriptCommand(1260);

    public static final ClientScriptCommand field5701 = new ClientScriptCommand(627);

    public static final ClientScriptCommand field5508 = new ClientScriptCommand(1055);

    public static final ClientScriptCommand field6142 = new ClientScriptCommand(311);

    public static final ClientScriptCommand field6143 = new ClientScriptCommand(1274);

    public static final ClientScriptCommand field6144 = new ClientScriptCommand(660);

    public static final ClientScriptCommand field6145 = new ClientScriptCommand(447);

    public static final ClientScriptCommand field5345 = new ClientScriptCommand(259);

    public static final ClientScriptCommand field6147 = new ClientScriptCommand(1150);

    public static final ClientScriptCommand field6148 = new ClientScriptCommand(302);

    public static final ClientScriptCommand field6149 = new ClientScriptCommand(1207);

    public static final ClientScriptCommand field5785 = new ClientScriptCommand(1208);

    public static final ClientScriptCommand field6384 = new ClientScriptCommand(1083);

    public static final ClientScriptCommand field5611 = new ClientScriptCommand(1184);

    public static final ClientScriptCommand field5443 = new ClientScriptCommand(57);

    public static final ClientScriptCommand field5759 = new ClientScriptCommand(942);

    public static final ClientScriptCommand field5544 = new ClientScriptCommand(117);

    public static final ClientScriptCommand field6156 = new ClientScriptCommand(902);

    public static final ClientScriptCommand field5742 = new ClientScriptCommand(839);

    public static final ClientScriptCommand field6158 = new ClientScriptCommand(1049);

    public static final ClientScriptCommand field6013 = new ClientScriptCommand(213);

    public static final ClientScriptCommand field6160 = new ClientScriptCommand(36);

    public static final ClientScriptCommand field6161 = new ClientScriptCommand(830);

    public static final ClientScriptCommand field6162 = new ClientScriptCommand(664);

    public static final ClientScriptCommand field6163 = new ClientScriptCommand(1338);

    public static final ClientScriptCommand field6164 = new ClientScriptCommand(159);

    public static final ClientScriptCommand field6165 = new ClientScriptCommand(542);

    public static final ClientScriptCommand field6042 = new ClientScriptCommand(1396);

    public static final ClientScriptCommand field5745 = new ClientScriptCommand(1078);

    public static final ClientScriptCommand field6470 = new ClientScriptCommand(33);

    public static final ClientScriptCommand field6169 = new ClientScriptCommand(1045);

    public static final ClientScriptCommand field6250 = new ClientScriptCommand(114);

    public static final ClientScriptCommand field6171 = new ClientScriptCommand(105);

    public static final ClientScriptCommand field6538 = new ClientScriptCommand(295);

    public static final ClientScriptCommand field6141 = new ClientScriptCommand(744);

    public static final ClientScriptCommand field6174 = new ClientScriptCommand(709);

    public static final ClientScriptCommand field6175 = new ClientScriptCommand(678);

    public static final ClientScriptCommand field6176 = new ClientScriptCommand(1161);

    public static final ClientScriptCommand field5885 = new ClientScriptCommand(420);

    public static final ClientScriptCommand field6178 = new ClientScriptCommand(1097);

    public static final ClientScriptCommand field6179 = new ClientScriptCommand(350);

    public static final ClientScriptCommand field6180 = new ClientScriptCommand(141);

    public static final ClientScriptCommand field6181 = new ClientScriptCommand(1231);

    public static final ClientScriptCommand field5240 = new ClientScriptCommand(1296);

    public static final ClientScriptCommand field6183 = new ClientScriptCommand(968);

    public static final ClientScriptCommand field6184 = new ClientScriptCommand(280);

    public static final ClientScriptCommand field6353 = new ClientScriptCommand(973);

    public static final ClientScriptCommand field6123 = new ClientScriptCommand(316);

    public static final ClientScriptCommand field6187 = new ClientScriptCommand(59);

    public static final ClientScriptCommand field6188 = new ClientScriptCommand(502);

    public static final ClientScriptCommand field5383 = new ClientScriptCommand(904);

    public static final ClientScriptCommand field6190 = new ClientScriptCommand(306);

    public static final ClientScriptCommand field6191 = new ClientScriptCommand(1033);

    public static final ClientScriptCommand field5909 = new ClientScriptCommand(281);

    public static final ClientScriptCommand field6193 = new ClientScriptCommand(194);

    public static final ClientScriptCommand field6194 = new ClientScriptCommand(675);

    public static final ClientScriptCommand field5844 = new ClientScriptCommand(1175);

    public static final ClientScriptCommand field6196 = new ClientScriptCommand(1093);

    public static final ClientScriptCommand field5401 = new ClientScriptCommand(74);

    public static final ClientScriptCommand field6198 = new ClientScriptCommand(687);

    public static final ClientScriptCommand field6568 = new ClientScriptCommand(974);

    public static final ClientScriptCommand field6200 = new ClientScriptCommand(601);

    public static final ClientScriptCommand field5445 = new ClientScriptCommand(10);

    public static final ClientScriptCommand field6202 = new ClientScriptCommand(1007);

    public static final ClientScriptCommand field6203 = new ClientScriptCommand(637);

    public static final ClientScriptCommand field6204 = new ClientScriptCommand(589);

    public static final ClientScriptCommand field6239 = new ClientScriptCommand(1108);

    public static final ClientScriptCommand field6091 = new ClientScriptCommand(1303);

    public static final ClientScriptCommand field6207 = new ClientScriptCommand(827);

    public static final ClientScriptCommand field6208 = new ClientScriptCommand(426);

    public static final ClientScriptCommand field6209 = new ClientScriptCommand(169);

    public static final ClientScriptCommand field5635 = new ClientScriptCommand(1276);

    public static final ClientScriptCommand field6211 = new ClientScriptCommand(84);

    public static final ClientScriptCommand field6212 = new ClientScriptCommand(9);

    public static final ClientScriptCommand field6213 = new ClientScriptCommand(1147);

    public static final ClientScriptCommand field6214 = new ClientScriptCommand(880);

    public static final ClientScriptCommand field5683 = new ClientScriptCommand(1005);

    public static final ClientScriptCommand field5993 = new ClientScriptCommand(998);

    public static final ClientScriptCommand field6217 = new ClientScriptCommand(846);

    public static final ClientScriptCommand field6218 = new ClientScriptCommand(226);

    public static final ClientScriptCommand field5382 = new ClientScriptCommand(397);

    public static final ClientScriptCommand field6276 = new ClientScriptCommand(1240);

    public static final ClientScriptCommand field6221 = new ClientScriptCommand(228);

    public static final ClientScriptCommand field6222 = new ClientScriptCommand(1203);

    public static final ClientScriptCommand field6223 = new ClientScriptCommand(1342);

    public static final ClientScriptCommand field6224 = new ClientScriptCommand(378);

    public static final ClientScriptCommand field5988 = new ClientScriptCommand(1283);

    public static final ClientScriptCommand field6226 = new ClientScriptCommand(1389);

    public static final ClientScriptCommand field6227 = new ClientScriptCommand(623);

    public static final ClientScriptCommand field5274 = new ClientScriptCommand(883);

    public static final ClientScriptCommand field6459 = new ClientScriptCommand(94);

    public static final ClientScriptCommand field5532 = new ClientScriptCommand(692);

    public static final ClientScriptCommand field5294 = new ClientScriptCommand(854);

    public static final ClientScriptCommand field5601 = new ClientScriptCommand(1310);

    public static final ClientScriptCommand field6233 = new ClientScriptCommand(1159);

    public static final ClientScriptCommand field6234 = new ClientScriptCommand(969);

    public static final ClientScriptCommand field6235 = new ClientScriptCommand(1036);

    public static final ClientScriptCommand field6236 = new ClientScriptCommand(1336);

    public static final ClientScriptCommand field6237 = new ClientScriptCommand(1022);

    public static final ClientScriptCommand field6238 = new ClientScriptCommand(110);

    public static final ClientScriptCommand field5318 = new ClientScriptCommand(496);

    public static final ClientScriptCommand field6240 = new ClientScriptCommand(1128);

    public static final ClientScriptCommand field6495 = new ClientScriptCommand(391);

    public static final ClientScriptCommand field5251 = new ClientScriptCommand(532);

    public static final ClientScriptCommand field6243 = new ClientScriptCommand(551);

    public static final ClientScriptCommand field6060 = new ClientScriptCommand(1333);

    public static final ClientScriptCommand field6245 = new ClientScriptCommand(240);

    public static final ClientScriptCommand field5153 = new ClientScriptCommand(613);

    public static final ClientScriptCommand field6247 = new ClientScriptCommand(1302);

    public static final ClientScriptCommand field6248 = new ClientScriptCommand(1140);

    public static final ClientScriptCommand field6249 = new ClientScriptCommand(1031);

    public static final ClientScriptCommand field6338 = new ClientScriptCommand(1157);

    public static final ClientScriptCommand field6251 = new ClientScriptCommand(1320);

    public static final ClientScriptCommand field6252 = new ClientScriptCommand(875);

    public static final ClientScriptCommand field6253 = new ClientScriptCommand(743);

    public static final ClientScriptCommand field6254 = new ClientScriptCommand(92);

    public static final ClientScriptCommand field6255 = new ClientScriptCommand(837);

    public static final ClientScriptCommand field6256 = new ClientScriptCommand(936);

    public static final ClientScriptCommand field6460 = new ClientScriptCommand(243);

    public static final ClientScriptCommand field6299 = new ClientScriptCommand(610);

    public static final ClientScriptCommand field6259 = new ClientScriptCommand(286);

    public static final ClientScriptCommand field5145 = new ClientScriptCommand(1028);

    public static final ClientScriptCommand field6446 = new ClientScriptCommand(1249);

    public static final ClientScriptCommand field6262 = new ClientScriptCommand(829);

    public static final ClientScriptCommand field6263 = new ClientScriptCommand(577);

    public static final ClientScriptCommand field6264 = new ClientScriptCommand(582);

    public static final ClientScriptCommand field6265 = new ClientScriptCommand(1428);

    public static final ClientScriptCommand field5498 = new ClientScriptCommand(1219);

    public static final ClientScriptCommand field5526 = new ClientScriptCommand(41);

    public static final ClientScriptCommand field6268 = new ClientScriptCommand(740);

    public static final ClientScriptCommand field6308 = new ClientScriptCommand(540);

    public static final ClientScriptCommand field5334 = new ClientScriptCommand(61);

    public static final ClientScriptCommand field6271 = new ClientScriptCommand(1030);

    public static final ClientScriptCommand field6272 = new ClientScriptCommand(1275);

    public static final ClientScriptCommand field5629 = new ClientScriptCommand(584);

    public static final ClientScriptCommand field6274 = new ClientScriptCommand(392);

    public static final ClientScriptCommand field6275 = new ClientScriptCommand(932);

    public static final ClientScriptCommand field5671 = new ClientScriptCommand(907);

    public static final ClientScriptCommand field5736 = new ClientScriptCommand(935);

    public static final ClientScriptCommand field6397 = new ClientScriptCommand(129);

    public static final ClientScriptCommand field6279 = new ClientScriptCommand(0);

    public static final ClientScriptCommand field6280 = new ClientScriptCommand(1346);

    public static final ClientScriptCommand field6281 = new ClientScriptCommand(318);

    public static final ClientScriptCommand field6282 = new ClientScriptCommand(268);

    public static final ClientScriptCommand field6283 = new ClientScriptCommand(467);

    public static final ClientScriptCommand field6220 = new ClientScriptCommand(1212);

    public static final ClientScriptCommand field5434 = new ClientScriptCommand(1182);

    public static final ClientScriptCommand field6286 = new ClientScriptCommand(187);

    public static final ClientScriptCommand field6287 = new ClientScriptCommand(579);

    public static final ClientScriptCommand field5141 = new ClientScriptCommand(911);

    public static final ClientScriptCommand field6289 = new ClientScriptCommand(1164);

    public static final ClientScriptCommand field6290 = new ClientScriptCommand(1044);

    public static final ClientScriptCommand field6291 = new ClientScriptCommand(603);

    public static final ClientScriptCommand field6292 = new ClientScriptCommand(181);

    public static final ClientScriptCommand field6293 = new ClientScriptCommand(147);

    public static final ClientScriptCommand field5339 = new ClientScriptCommand(1018);

    public static final ClientScriptCommand field6295 = new ClientScriptCommand(1393);

    public static final ClientScriptCommand field6296 = new ClientScriptCommand(1094);

    public static final ClientScriptCommand field6297 = new ClientScriptCommand(847);

    public static final ClientScriptCommand field6298 = new ClientScriptCommand(593);

    public static final ClientScriptCommand field6115 = new ClientScriptCommand(877);

    public static final ClientScriptCommand field6300 = new ClientScriptCommand(348);

    public static final ClientScriptCommand field6468 = new ClientScriptCommand(474);

    public static final ClientScriptCommand field6302 = new ClientScriptCommand(1233);

    public static final ClientScriptCommand field6303 = new ClientScriptCommand(466);

    public static final ClientScriptCommand field6304 = new ClientScriptCommand(1317);

    public static final ClientScriptCommand field6305 = new ClientScriptCommand(1284);

    public static final ClientScriptCommand field5171 = new ClientScriptCommand(702);

    public static final ClientScriptCommand field6512 = new ClientScriptCommand(1076);

    public static final ClientScriptCommand field5488 = new ClientScriptCommand(752);

    public static final ClientScriptCommand field5419 = new ClientScriptCommand(719);

    public static final ClientScriptCommand field6310 = new ClientScriptCommand(1269);

    public static final ClientScriptCommand field6311 = new ClientScriptCommand(1061);

    public static final ClientScriptCommand field6312 = new ClientScriptCommand(1360);

    public static final ClientScriptCommand field5668 = new ClientScriptCommand(1002);

    public static final ClientScriptCommand field6314 = new ClientScriptCommand(796);

    public static final ClientScriptCommand field6315 = new ClientScriptCommand(1092);

    public static final ClientScriptCommand field5156 = new ClientScriptCommand(80);

    public static final ClientScriptCommand field6317 = new ClientScriptCommand(247);

    public static final ClientScriptCommand field6318 = new ClientScriptCommand(751);

    public static final ClientScriptCommand field6319 = new ClientScriptCommand(887);

    public static final ClientScriptCommand field6320 = new ClientScriptCommand(1188);

    public static final ClientScriptCommand field6321 = new ClientScriptCommand(929);

    public static final ClientScriptCommand field6322 = new ClientScriptCommand(716);

    public static final ClientScriptCommand field6323 = new ClientScriptCommand(183);

    public static final ClientScriptCommand field6324 = new ClientScriptCommand(498);

    public static final ClientScriptCommand field6325 = new ClientScriptCommand(990);

    public static final ClientScriptCommand field6326 = new ClientScriptCommand(1271);

    public static final ClientScriptCommand field6327 = new ClientScriptCommand(1340);

    public static final ClientScriptCommand field6328 = new ClientScriptCommand(1003);

    public static final ClientScriptCommand field6329 = new ClientScriptCommand(410);

    public static final ClientScriptCommand field5587 = new ClientScriptCommand(831);

    public static final ClientScriptCommand field6331 = new ClientScriptCommand(1348);

    public static final ClientScriptCommand field6332 = new ClientScriptCommand(645);

    public static final ClientScriptCommand field6333 = new ClientScriptCommand(1318);

    public static final ClientScriptCommand field6334 = new ClientScriptCommand(360);

    public static final ClientScriptCommand field5539 = new ClientScriptCommand(1235);

    public static final ClientScriptCommand field6336 = new ClientScriptCommand(844);

    public static final ClientScriptCommand field6337 = new ClientScriptCommand(246);

    public static final ClientScriptCommand field5733 = new ClientScriptCommand(1118);

    public static final ClientScriptCommand field6339 = new ClientScriptCommand(1335);

    public static final ClientScriptCommand field5557 = new ClientScriptCommand(1374);

    public static final ClientScriptCommand field5518 = new ClientScriptCommand(515);

    public static final ClientScriptCommand field6342 = new ClientScriptCommand(461);

    public static final ClientScriptCommand field6343 = new ClientScriptCommand(99);

    public static final ClientScriptCommand field6344 = new ClientScriptCommand(659);

    public static final ClientScriptCommand field6345 = new ClientScriptCommand(102);

    public static final ClientScriptCommand field6346 = new ClientScriptCommand(245);

    public static final ClientScriptCommand field6347 = new ClientScriptCommand(1398);

    public static final ClientScriptCommand field5379 = new ClientScriptCommand(1424);

    public static final ClientScriptCommand field6349 = new ClientScriptCommand(334);

    public static final ClientScriptCommand field6350 = new ClientScriptCommand(1407);

    public static final ClientScriptCommand field6351 = new ClientScriptCommand(1187);

    public static final ClientScriptCommand field6352 = new ClientScriptCommand(1091);

    public static final ClientScriptCommand field5211 = new ClientScriptCommand(90);

    public static final ClientScriptCommand field6354 = new ClientScriptCommand(393);

    public static final ClientScriptCommand field6355 = new ClientScriptCommand(636);

    public static final ClientScriptCommand field6356 = new ClientScriptCommand(443);

    public static final ClientScriptCommand field6114 = new ClientScriptCommand(588);

    public static final ClientScriptCommand field6358 = new ClientScriptCommand(825);

    public static final ClientScriptCommand field5714 = new ClientScriptCommand(647);

    public static final ClientScriptCommand field6360 = new ClientScriptCommand(763);

    public static final ClientScriptCommand field6361 = new ClientScriptCommand(3);

    public static final ClientScriptCommand field6362 = new ClientScriptCommand(81);

    public static final ClientScriptCommand field6363 = new ClientScriptCommand(454);

    public static final ClientScriptCommand field6364 = new ClientScriptCommand(513);

    public static final ClientScriptCommand field6357 = new ClientScriptCommand(1038);

    public static final ClientScriptCommand field6366 = new ClientScriptCommand(374);

    public static final ClientScriptCommand field6511 = new ClientScriptCommand(897);

    public static final ClientScriptCommand field6368 = new ClientScriptCommand(385);

    public static final ClientScriptCommand field6369 = new ClientScriptCommand(851);

    public static final ClientScriptCommand field6370 = new ClientScriptCommand(353);

    public static final ClientScriptCommand field6371 = new ClientScriptCommand(42);

    public static final ClientScriptCommand field5600 = new ClientScriptCommand(398);

    public static final ClientScriptCommand field6041 = new ClientScriptCommand(1425);

    public static final ClientScriptCommand field5237 = new ClientScriptCommand(210);

    public static final ClientScriptCommand field6375 = new ClientScriptCommand(287);

    public static final ClientScriptCommand field5375 = new ClientScriptCommand(494);

    public static final ClientScriptCommand field6377 = new ClientScriptCommand(905);

    public static final ClientScriptCommand field5752 = new ClientScriptCommand(769);

    public static final ClientScriptCommand field6379 = new ClientScriptCommand(694);

    public static final ClientScriptCommand field6269 = new ClientScriptCommand(983);

    public static final ClientScriptCommand field6242 = new ClientScriptCommand(291);

    public static final ClientScriptCommand field5485 = new ClientScriptCommand(980);

    public static final ClientScriptCommand field6455 = new ClientScriptCommand(1153);

    public static final ClientScriptCommand field5453 = new ClientScriptCommand(1280);

    public static final ClientScriptCommand field5934 = new ClientScriptCommand(991);

    public static final ClientScriptCommand field6386 = new ClientScriptCommand(1255);

    public static final ClientScriptCommand field6387 = new ClientScriptCommand(386);

    public static final ClientScriptCommand field6388 = new ClientScriptCommand(956);

    public static final ClientScriptCommand field6389 = new ClientScriptCommand(797);

    public static final ClientScriptCommand field6390 = new ClientScriptCommand(1354);

    public static final ClientScriptCommand field6391 = new ClientScriptCommand(865);

    public static final ClientScriptCommand field6392 = new ClientScriptCommand(250);

    public static final ClientScriptCommand field6393 = new ClientScriptCommand(1363);

    public static final ClientScriptCommand field6394 = new ClientScriptCommand(308);

    public static final ClientScriptCommand field6061 = new ClientScriptCommand(499);

    public static final ClientScriptCommand field6517 = new ClientScriptCommand(535);

    public static final ClientScriptCommand field5821 = new ClientScriptCommand(718);

    public static final ClientScriptCommand field6398 = new ClientScriptCommand(832);

    public static final ClientScriptCommand field6399 = new ClientScriptCommand(725);

    public static final ClientScriptCommand field6400 = new ClientScriptCommand(1381);

    public static final ClientScriptCommand field6530 = new ClientScriptCommand(341);

    public static final ClientScriptCommand field6402 = new ClientScriptCommand(78);

    public static final ClientScriptCommand field5247 = new ClientScriptCommand(1075);

    public static final ClientScriptCommand field6404 = new ClientScriptCommand(1421);

    public static final ClientScriptCommand field6405 = new ClientScriptCommand(440);

    public static final ClientScriptCommand field6406 = new ClientScriptCommand(1154);

    public static final ClientScriptCommand field6407 = new ClientScriptCommand(1270);

    public static final ClientScriptCommand field6408 = new ClientScriptCommand(794);

    public static final ClientScriptCommand field5219 = new ClientScriptCommand(483);

    public static final ClientScriptCommand field5283 = new ClientScriptCommand(79);

    public static final ClientScriptCommand field6411 = new ClientScriptCommand(1026);

    public static final ClientScriptCommand field6412 = new ClientScriptCommand(1116);

    public static final ClientScriptCommand field5446 = new ClientScriptCommand(267);

    public static final ClientScriptCommand field6414 = new ClientScriptCommand(698);

    public static final ClientScriptCommand field6415 = new ClientScriptCommand(840);

    public static final ClientScriptCommand field6416 = new ClientScriptCommand(314);

    public static final ClientScriptCommand field6417 = new ClientScriptCommand(914);

    public static final ClientScriptCommand field5806 = new ClientScriptCommand(326);

    public static final ClientScriptCommand field6419 = new ClientScriptCommand(629);

    public static final ClientScriptCommand field5302 = new ClientScriptCommand(526);

    public static final ClientScriptCommand field6421 = new ClientScriptCommand(788);

    public static final ClientScriptCommand field6422 = new ClientScriptCommand(1206);

    public static final ClientScriptCommand field6503 = new ClientScriptCommand(707);

    public static final ClientScriptCommand field6424 = new ClientScriptCommand(146);

    public static final ClientScriptCommand field6241 = new ClientScriptCommand(309);

    public static final ClientScriptCommand field6426 = new ClientScriptCommand(864);

    public static final ClientScriptCommand field6278 = new ClientScriptCommand(123);

    public static final ClientScriptCommand field6428 = new ClientScriptCommand(5);

    public static final ClientScriptCommand field6116 = new ClientScriptCommand(549);

    public static final ClientScriptCommand field5706 = new ClientScriptCommand(556);

    public static final ClientScriptCommand field5610 = new ClientScriptCommand(457);

    public static final ClientScriptCommand field6566 = new ClientScriptCommand(446);

    public static final ClientScriptCommand field6433 = new ClientScriptCommand(1232);

    public static final ClientScriptCommand field5159 = new ClientScriptCommand(195);

    public static final ClientScriptCommand field5732 = new ClientScriptCommand(273);

    public static final ClientScriptCommand field5879 = new ClientScriptCommand(71);

    public static final ClientScriptCommand field5868 = new ClientScriptCommand(1010);

    public static final ClientScriptCommand field5373 = new ClientScriptCommand(954);

    public static final ClientScriptCommand field6439 = new ClientScriptCommand(438);

    public static final ClientScriptCommand field6440 = new ClientScriptCommand(1406);

    public static final ClientScriptCommand field6441 = new ClientScriptCommand(1001);

    public static final ClientScriptCommand field6526 = new ClientScriptCommand(696);

    public static final ClientScriptCommand field6443 = new ClientScriptCommand(20);

    public static final ClientScriptCommand field5451 = new ClientScriptCommand(565);

    public static final ClientScriptCommand field5664 = new ClientScriptCommand(715);

    public static final ClientScriptCommand field5386 = new ClientScriptCommand(1297);

    public static final ClientScriptCommand field6447 = new ClientScriptCommand(345);

    public static final ClientScriptCommand field5792 = new ClientScriptCommand(738);

    public static final ClientScriptCommand field6449 = new ClientScriptCommand(665);

    public static final ClientScriptCommand field6420 = new ClientScriptCommand(166);

    public static final ClientScriptCommand field6451 = new ClientScriptCommand(612);

    public static final ClientScriptCommand field5303 = new ClientScriptCommand(1402);

    public static final ClientScriptCommand field6453 = new ClientScriptCommand(77);

    public static final ClientScriptCommand field6454 = new ClientScriptCommand(269);

    public static final ClientScriptCommand field5149 = new ClientScriptCommand(1023);

    public static final ClientScriptCommand field5918 = new ClientScriptCommand(205);

    public static final ClientScriptCommand field6457 = new ClientScriptCommand(970);

    public static final ClientScriptCommand field6458 = new ClientScriptCommand(458);

    public static final ClientScriptCommand field5825 = new ClientScriptCommand(137);

    public static final ClientScriptCommand field5593 = new ClientScriptCommand(1121);

    public static final ClientScriptCommand field6461 = new ClientScriptCommand(261);

    public static final ClientScriptCommand field5964 = new ClientScriptCommand(1205);

    public static final ClientScriptCommand field6463 = new ClientScriptCommand(493);

    public static final ClientScriptCommand field6464 = new ClientScriptCommand(896);

    public static final ClientScriptCommand field5832 = new ClientScriptCommand(791);

    public static final ClientScriptCommand field6466 = new ClientScriptCommand(1068);

    public static final ClientScriptCommand field6052 = new ClientScriptCommand(450);

    public static final ClientScriptCommand field6231 = new ClientScriptCommand(1395);

    public static final ClientScriptCommand field6469 = new ClientScriptCommand(481);

    public static final ClientScriptCommand field5346 = new ClientScriptCommand(1356);

    public static final ClientScriptCommand field6471 = new ClientScriptCommand(1170);

    public static final ClientScriptCommand field5882 = new ClientScriptCommand(372);

    public static final ClientScriptCommand field5458 = new ClientScriptCommand(676);

    public static final ClientScriptCommand field5962 = new ClientScriptCommand(1079);

    public static final ClientScriptCommand field5415 = new ClientScriptCommand(388);

    public static final ClientScriptCommand field6476 = new ClientScriptCommand(668);

    public static final ClientScriptCommand field6477 = new ClientScriptCommand(25);

    public static final ClientScriptCommand field5521 = new ClientScriptCommand(729);

    public static final ClientScriptCommand field6479 = new ClientScriptCommand(1325);

    public static final ClientScriptCommand field6430 = new ClientScriptCommand(784);

    public static final ClientScriptCommand field6481 = new ClientScriptCommand(1166);

    public static final ClientScriptCommand field6482 = new ClientScriptCommand(1247);

    public static final ClientScriptCommand field6483 = new ClientScriptCommand(1253);

    public static final ClientScriptCommand field6484 = new ClientScriptCommand(1248);

    public static final ClientScriptCommand field6493 = new ClientScriptCommand(773);

    public static final ClientScriptCommand field5839 = new ClientScriptCommand(807);

    public static final ClientScriptCommand field6487 = new ClientScriptCommand(984);

    public static final ClientScriptCommand field6444 = new ClientScriptCommand(144);

    public static final ClientScriptCommand field6489 = new ClientScriptCommand(1192);

    public static final ClientScriptCommand field6490 = new ClientScriptCommand(1401);

    public static final ClientScriptCommand field6491 = new ClientScriptCommand(477);

    public static final ClientScriptCommand field5246 = new ClientScriptCommand(34);

    public static final ClientScriptCommand field5860 = new ClientScriptCommand(679);

    public static final ClientScriptCommand field5430 = new ClientScriptCommand(1024);

    public static final ClientScriptCommand field5892 = new ClientScriptCommand(609);

    public static final ClientScriptCommand field6496 = new ClientScriptCommand(371);

    public static final ClientScriptCommand field6497 = new ClientScriptCommand(1352);

    public static final ClientScriptCommand field6498 = new ClientScriptCommand(1387);

    public static final ClientScriptCommand field5691 = new ClientScriptCommand(453);

    public static final ClientScriptCommand field6166 = new ClientScriptCommand(174);

    public static final ClientScriptCommand field5364 = new ClientScriptCommand(505);

    public static final ClientScriptCommand field6502 = new ClientScriptCommand(895);

    public static final ClientScriptCommand field5837 = new ClientScriptCommand(1332);

    public static final ClientScriptCommand field6504 = new ClientScriptCommand(76);

    public static final ClientScriptCommand field6505 = new ClientScriptCommand(1405);

    public static final ClientScriptCommand field6506 = new ClientScriptCommand(1218);

    public static final ClientScriptCommand field6507 = new ClientScriptCommand(1241);

    public static final ClientScriptCommand field5851 = new ClientScriptCommand(803);

    public static final ClientScriptCommand field5847 = new ClientScriptCommand(697);

    public static final ClientScriptCommand field6510 = new ClientScriptCommand(578);

    public static final ClientScriptCommand field6396 = new ClientScriptCommand(544);

    public static final ClientScriptCommand field6488 = new ClientScriptCommand(651);

    public static final ClientScriptCommand field6513 = new ClientScriptCommand(18);

    public static final ClientScriptCommand field6514 = new ClientScriptCommand(1008);

    public static final ClientScriptCommand field6515 = new ClientScriptCommand(768);

    public static final ClientScriptCommand field6516 = new ClientScriptCommand(691);

    public static final ClientScriptCommand field6201 = new ClientScriptCommand(534);

    public static final ClientScriptCommand field6518 = new ClientScriptCommand(939);

    public static final ClientScriptCommand field6004 = new ClientScriptCommand(943);

    public static final ClientScriptCommand field6146 = new ClientScriptCommand(188);

    public static final ClientScriptCommand field5191 = new ClientScriptCommand(592);

    public static final ClientScriptCommand field5849 = new ClientScriptCommand(746);

    public static final ClientScriptCommand field6523 = new ClientScriptCommand(416);

    public static final ClientScriptCommand field6524 = new ClientScriptCommand(923);

    public static final ClientScriptCommand field6525 = new ClientScriptCommand(727);

    public static final ClientScriptCommand field6383 = new ClientScriptCommand(469);

    public static final ClientScriptCommand field6527 = new ClientScriptCommand(38);

    public static final ClientScriptCommand field6528 = new ClientScriptCommand(412);

    public static final ClientScriptCommand field6529 = new ClientScriptCommand(98);

    public static final ClientScriptCommand field5380 = new ClientScriptCommand(150);

    public static final ClientScriptCommand field6492 = new ClientScriptCommand(685);

    public static final ClientScriptCommand field6532 = new ClientScriptCommand(1386);

    public static final ClientScriptCommand field6533 = new ClientScriptCommand(507);

    public static final ClientScriptCommand field6534 = new ClientScriptCommand(802);

    public static final ClientScriptCommand field6535 = new ClientScriptCommand(143);

    public static final ClientScriptCommand field6536 = new ClientScriptCommand(1191);

    public static final ClientScriptCommand field6537 = new ClientScriptCommand(298);

    public static final ClientScriptCommand field5276 = new ClientScriptCommand(414);

    public static final ClientScriptCommand field6539 = new ClientScriptCommand(324);

    public static final ClientScriptCommand field6540 = new ClientScriptCommand(29);

    public static final ClientScriptCommand field6478 = new ClientScriptCommand(480);

    public static final ClientScriptCommand field6378 = new ClientScriptCommand(641);

    public static final ClientScriptCommand field6543 = new ClientScriptCommand(220);

    public static final ClientScriptCommand field6544 = new ClientScriptCommand(492);

    public static final ClientScriptCommand field6545 = new ClientScriptCommand(1048);

    public static final ClientScriptCommand field6546 = new ClientScriptCommand(616);

    public static final ClientScriptCommand field6547 = new ClientScriptCommand(428);

    public static final ClientScriptCommand field6548 = new ClientScriptCommand(418);

    public static final ClientScriptCommand field5517 = new ClientScriptCommand(1278);

    public static final ClientScriptCommand field6550 = new ClientScriptCommand(1292);

    public static final ClientScriptCommand field6551 = new ClientScriptCommand(332);

    public static final ClientScriptCommand field6552 = new ClientScriptCommand(602);

    public static final ClientScriptCommand field6553 = new ClientScriptCommand(608);

    public static final ClientScriptCommand field6554 = new ClientScriptCommand(650);

    public static final ClientScriptCommand field6555 = new ClientScriptCommand(965);

    public static final ClientScriptCommand field6365 = new ClientScriptCommand(1306);

    public static final ClientScriptCommand field5479 = new ClientScriptCommand(1267);

    public static final ClientScriptCommand field6558 = new ClientScriptCommand(648);

    public static final ClientScriptCommand field6559 = new ClientScriptCommand(1288);

    public static final ClientScriptCommand field6560 = new ClientScriptCommand(1199);

    public static final ClientScriptCommand field5578 = new ClientScriptCommand(677);

    public static final ClientScriptCommand field5441 = new ClientScriptCommand(749);

    public static final ClientScriptCommand field6456 = new ClientScriptCommand(1209);

    public static final ClientScriptCommand field6564 = new ClientScriptCommand(97);

    public static final ClientScriptCommand field6565 = new ClientScriptCommand(547);

    public static final ClientScriptCommand field5495 = new ClientScriptCommand(1277);

    public static final ClientScriptCommand field6567 = new ClientScriptCommand(733);

    public static final ClientScriptCommand field5817 = new ClientScriptCommand(180);

    public static final ClientScriptCommand field5930 = new ClientScriptCommand(959);

    public static final ClientScriptCommand field6570 = new ClientScriptCommand(688);

    public final int index;

    public final boolean isLargeOperand;

    public static ClientScriptCommand[] values() {
		return new ClientScriptCommand[] { field6279, field6154, field5389, field6361, field6462, field6428, field6055, field6380, field5234, field6212, field5445, field5622, field5183, field5236, field5828, field5665, field5890, field5906, field6513, field5663, field6443, field5296, field5835, field5289, field5854, field6477, field6172, field5940, field5973, field6540, field5841, field5258, field5763, field6470, field5246, field6266, field6160, field5556, field6527, field5980, field5552, field5526, field6371, field5327, field5767, field5895, field6025, field5880, field6150, GOSUB_WITH_PARAMS, DEFINE_ARRAY, field5340, field6474, field5580, field5403, field5871, field6569, field5443, field5928, field6187, field5577, field5334, field6033, field5764, field5189, field5690, field6401, field5912, JOIN_STRING, PUSH_ARRAY3, field5715, field5879, field6501, field5310, field5401, field5572, field6504, field6453, field6402, field5283, field5156, field6362, field5984, field5602, field6211, field5362, field5800, field5978, field5226, field5975, field5211, field5335, field6254, field6126, field6459, field6473, field5506, field6564, field6529, field6343, field6205, field5161, field6345, field5182, field6075, field6171, field6035, field5343, field5272, field5679, field6238, field6561, field6076, field5881, field6250, field5749, field5496, field5544, field5290, field6016, field5214, field6210, field5932, field6278, field5317, field5913, field5829, BRANCH_IF_FALSE, field5644, field6397, field5342, field5347, field5597, field5741, field5910, field5746, field5815, field5825, field6044, field6117, field5502, field6180, field5264, field6535, field6444, field6070, field6424, field6293, field6571, field5300, field5380, field5480, field6413, field5299, field5949, field5514, field6050, field5349, field5270, field6164, field5581, field5396, field5404, field5686, field6467, field5872, field6420, field6382, field5762, field6209, field5423, field5483, field6475, field6078, field6166, field6131, field5846, field5190, field6093, field5422, field5817, field6292, field5972, field6323, field5474, field5328, PUSH_ARRAY, field6286, field6146, field5358, field6225, field5813, field5883, POP_STRING_LOCAL, field6193, field5159, field5197, field5369, field5361, field5467, field6112, field5308, field5652, field5637, PUSH_CONSTANT_INT, field5918, field5703, field6054, field5789, field5621, field5237, field5512, field5527, field6013, field6088, field5569, field5727, field5704, field6074, field5177, field6543, field5564, POP_STRING_DISCARD, field5904, field5777, field5297, field6218, field6049, field6221, field5388, field5304, field5625, field5608, field5326, field5630, field6284, field6450, field5266, field5461, POP_VARBIT, field6245, field6562, field5723, field6460, field5638, field6346, field6337, field6317, field6101, field5217, field6392, field5944, field5852, field5941, field5748, field6472, field5202, field6085, field5499, field5345, field5774, field6461, field5454, field5155, field6442, field5596, field5999, field5446, field6282, field6454, field5243, field5372, field6081, field5732, field5897, field5291, field6267, field5535, field5633, field5507, field6184, field5909, field6109, field6051, field5730, field5228, field6259, field6375, field5206, field5513, field5628, field6242, field5481, field6039, field5248, field6538, field5779, field6100, field6537, field5338, field5917, field6445, field6148, field5996, field6309, field5818, field6190, field5864, field6394, field6241, field6119, field6142, field5659, field5566, field6416, field6137, field6123, field5421, field6281, field6381, field5561, field6229, field5957, field5588, field6539, field6246, field5806, field5390, field5653, field5278, field5295, field5808, field6551, field5516, field6349, field5263, field5187, field6020, LONG_BRANCH_NOT, field5750, field5707, field6530, field6108, field5204, field5620, field6447, field5843, field5698, field6300, field5524, field6179, field5378, field5325, field6370, field5697, field5554, PUSH_INT_LOCAL, field5699, field6197, field6531, field6334, field5224, field5307, field6094, field6260, field5203, field6037, field5377, field6159, field5366, field5976, field6496, field5882, field5306, field6366, field5208, field5850, field6028, field6224, field6023, field5744, field5856, field5968, field5315, field5188, field6368, field6387, field5470, field5415, field6509, field6022, field6495, field6274, field6354, field5799, field5221, field5260, field5382, field5600, field5365, field5754, field5560, field5827, field5471, field6157, POP_LONG_LOCAL, field6206, field5432, field6128, field6043, field6329, LONG_BRANCH_GREATER_THAN_OR_EQUALS, field6528, field5982, field5276, field5288, field6523, field5265, field6548, field5359, field5885, field5466, field6244, field5462, field5330, field5268, field6208, field5803, field6547, field5676, POP_LONG_DISCARD, field6130, field6434, field5252, field6167, field6216, field5344, field5414, field6439, field5724, field6405, field5719, field5929, field6356, field5515, field5997, field6566, field6145, field6113, field5713, field6052, field5350, field5400, field5691, field6363, field5766, field6418, field5610, field6458, field5773, field5371, field6342, field5614, field5658, BRANCH_IF_TRUE, field6301, field6303, field6283, field5181, field6383, field5545, field5565, field5947, field5945, field6468, field5525, field6071, field6491, field6520, field5675, field6478, field6469, POP_VAR, field5219, field5604, field5412, field5594, field6024, field5509, field5640, field5184, field5729, field6544, field6463, field5375, field5951, field5318, field5231, field6324, field6061, field5830, field5631, field6188, field5456, field5896, field5364, field6285, field6533, field5751, field5700, field6132, field6385, field5409, field6364, field5902, field5518, field5542, field5323, field5425, field5195, field6215, field5961, field5710, field5678, PUSH_VAR, field5216, field5302, field5598, field5316, POP_ARRAY2, field5833, POP_ARRAY, field5251, field5151, field6201, field6517, field6067, field5465, field5417, field5915, field6308, field5726, field6165, BRANCH_NOT, field6396, field6494, field5863, field6565, PUSH_LONG_LOCAL, field6116, field5674, field6243, field5747, field6124, field5280, field6557, field5706, field5873, field6001, field5831, field5398, field6316, field6058, field5786, LONG_BRANCH_GREATER_THAN, field5451, field5809, field6335, field5632, field6014, field5787, field5491, field6090, field5776, field5331, field6437, field5392, field6263, field6510, field6287, field5775, field6182, field6264, field5230, field5629, field5411, field5874, field5994, field6114, field6204, field6168, field6480, field5191, field6298, field5646, field5492, field5540, field5255, field5669, field5607, field6083, field6200, field6552, field6291, field5198, field6104, field5965, field5585, field6553, field5892, field6299, field5222, field6451, field5153, field5355, field5511, field6546, field6032, field6069, field5740, field5337, field5692, field5862, field6227, field5857, field6079, field5793, field5701, field6486, field6419, field6189, field5429, field5606, field5196, field5998, field6086, field6355, field6203, field5991, field5858, field6127, field6378, field6073, field5139, field5352, field6332, field5811, field5714, field6558, field6185, field6554, field6488, field5192, field6056, field5769, field5201, field5645, field5855, field5510, field6344, field6144, field6015, field5694, field5960, field6162, field6449, field5426, field5810, field6476, field5200, field6173, field5549, field5543, field6003, field5782, field6194, field5458, field5578, field6175, field5860, field5357, field5460, field6097, field5816, field6306, field6492, field6313, field6198, field6570, field5370, field6125, field6516, field5532, BRANCH_GREATER_THAN, field6379, field5959, field6526, field5847, field6414, field5814, field6034, field5670, field5171, field5484, field6438, field5971, field5273, field6503, field5523, field6174, field5309, field6134, field5758, field6435, field6040, field5664, field6322, field5616, field5821, field5419, field5898, field6129, field6288, field5845, field5440, field6399, field5684, field6525, field5249, field5521, field5599, field5924, field5954, field6567, field6373, field5225, field5354, field5424, field5792, field6192, field6268, field6007, field5680, field6253, field6141, field5486, field5849, field6048, field5717, field5441, field6005, field6318, field5488, field6107, field5591, field5227, field5933, field5875, field5921, field5387, field5332, PUSH_LONG_CONSTANT, field5530, field6360, field5716, field5546, field5920, field5428, field6515, field5752, field5157, field5876, field6409, field6493, field5823, field6423, field5416, field6099, field5320, field5391, field6151, field5313, field5794, field6121, field6430, field5570, field5582, field5893, field6421, field5838, field5405, field5832, field5503, field5563, field6408, field6105, field6314, field6389, field5468, field5901, field6152, field5576, field6534, field5851, field5402, field5647, field5709, field5839, field5367, field5990, field5807, field5568, field5233, field6077, field5520, PUSH_STRING_LOCAL, field5943, field6136, field5693, field5619, field5986, field5241, field6106, field5899, field5989, field6358, field5528, field6207, field5983, field6262, field6161, field5587, field6398, field5592, field5861, field5254, field5923, field6255, field5772, field5742, field6415, field5393, field5939, field6429, field6336, field5788, field6217, field6297, field5642, field5376, field5636, field6369, field5685, field5457, field5294, field5770, field5435, field5444, field6403, field5887, field5399, field6425, field5384, field6228, field6426, field6391, BRANCH, field6138, field5259, field5889, field5573, field5859, field5281, field5784, field6367, field6252, field5725, field6115, field5194, field6431, field6214, field5623, field5605, field5274, field5765, field5643, field5152, field6319, field5395, field6556, field5207, field5734, field5529, field5791, field5627, field6502, field6464, field6511, field5324, field5884, field5464, field5406, field6156, field5650, field5383, field6377, field5755, field5671, field5822, field5702, field6118, field5141, field5244, field5969, field6417, field5193, field5533, field6436, field5559, field5427, field6029, field5891, field5209, field6524, field5408, field5634, field6522, field6120, field6448, field6321, field6140, field5771, field6275, field5853, field5431, field5736, field6256, field5504, field6095, field6518, field5574, field6019, field5759, field6004, field5459, PUSH_ARRAY2, field5695, field5802, field6508, field5783, field5368, field5907, field6053, field5250, field5373, field6410, field6388, field5301, field5473, field5930, field5735, field5478, field5586, field5341, field5256, field6555, field5641, field5974, field6183, field6234, field6457, field5490, field5239, field6353, field6568, field6170, field5677, field5805, field5584, field5801, field5485, field5538, field6017, field6269, field6487, field6195, field5711, field5277, field5798, field5385, field6325, field5934, field5500, field6133, field6063, field5238, field5536, field5903, field5993, field5269, field5753, field6441, field5668, field6328, field5696, field5683, field5905, field6202, field6514, field5666, field5868, field6230, field5497, field5353, field5919, field6372, field5927, field6521, field5339, field5186, field5722, field5738, field6237, field5149, field5430, field5878, field6411, field5946, field5145, field6177, field6271, field6249, field5613, field6191, field5158, field5819, field6235, field5319, field6357, field5908, field5718, field5185, field6087, field6155, field6290, field6169, field5547, field6541, field6545, field6158, field5168, field5553, field5205, field5284, field5914, field5508, field6542, field6064, field5603, field5942, field6027, field6311, field5489, field6082, field6031, field5555, BRANCH_LESS_THAN_OR_EQUALS, field6059, field6466, field5900, field5804, POP_INT_LOCAL, field5922, field5655, field6006, field5247, field6512, field5433, field5745, field5962, field5418, field5886, field5796, field6384, field5848, field6427, field5163, field5360, field6258, field6376, field5639, field6352, field6315, field6196, field6296, field5618, field5687, field6178, field6002, field6359, field5938, field5756, field6219, LONG_BRANCH_LESS_THAN_OR_EQUALS, field5212, field5455, field5562, field5257, field6239, field5452, field5836, field5286, field5720, field6277, field5336, field6009, field6412, field5285, field5733, field5708, field5648, field5593, BRANCH_GREATER_THAN_OR_EQUALS, field5888, field5199, field6080, field5812, field5589, field6240, field5293, field6465, field6103, field5215, field6452, field5790, field5595, field5609, field5413, field5721, field5172, field6248, field5797, field5894, field5867, field5245, field5626, field5955, field6213, field5682, field5397, field6147, field5472, field5232, field6455, field6406, field5705, field5450, field6338, field5220, field6233, field5329, field6176, field5979, field5931, field6289, field5487, field6481, _SWITCH, field5781, field6341, field6471, field5579, field5475, field5728, field5279, field5844, field5956, field5356, field6089, field5795, field5992, field5916, field5434, field5967, field5611, field6549, field6036, field6351, field6320, field5223, field6030, field6536, field6489, field5688, field6199, field5834, field5537, field5442, field5210, field6560, field5494, field5420, field5179, field6222, field5213, field5964, field6422, field6149, field5785, field6456, field6270, field5615, field6220, POP_INT_DISCARD, field5761, field5493, field5778, field5977, field6506, field5498, field6340, field5617, field5731, field5877, field5298, field6110, field5282, field5321, field5275, field6122, field6485, field6181, field6433, field6302, field6330, field5539, field5558, field5267, field5519, field6068, field6276, field6507, field5662, field5870, field5180, field6111, field5689, field6482, field6484, field6446, field5966, field5436, field5963, field6483, field6307, field6386, field5757, field5661, field5548, field5477, field6139, field5869, field5407, field5866, field6021, field5437, field5987, field5479, field5469, field6310, field6407, field6326, field5737, field5958, field6143, field6272, field5635, field5495, field5517, field5287, field5453, field5865, field6008, field5988, field6305, field5262, LONG_BRANCH_LESS_THAN, field5534, field6559, field6273, field6257, field6018, field6550, field5271, field5760, field6098, field5240, field5386, field6011, field5911, field5253, field5842, field6247, field6091, field6153, field6038, field6365, field5439, field5768, field5612, field5601, field5311, field5292, field6062, field6072, field5410, field6374, field6304, field6333, field6057, field6251, field5667, field5575, field5673, field6084, field6479, field5712, field5780, BRANCH_LESS_THAN, field5312, field5820, field5218, field5837, field6060, field5522, field6339, field6236, field5840, field6163, field6500, field6327, field6096, field6223, field5351, field6135, field5950, field6280, field5590, field6331, _RETURN, field6026, PUSH_VARBIT, field6497, field6010, field6390, field5447, field5346, field5925, field5656, field5936, field6312, field5649, field5242, field6393, field5970, field5381, field6092, field6499, field5505, field5824, field6232, field5952, field6045, field6432, field5557, field5333, PUSH_CONSTANT_STRING, field5672, field5551, field5550, field5935, field6400, field5449, field5985, field5826, field6102, field6532, field6498, field6348, field6226, field5624, field5348, field6261, field6295, field5681, field6231, field6042, field5531, field6347, field5229, field5438, field6490, field5303, LONG_BRANCH_EQUALS, field6065, field6505, field6440, field6350, field5654, field5363, field6000, field5482, field5739, field5314, field5322, field6186, field5948, field5995, field5541, BRANCH_EQUALS, field5476, field6404, field5583, field5981, field5379, field6041, field5571, field5743, field6265, field6012, field6046, field6563 };
	}

	public ClientScriptCommand(int index, boolean isLargeOperand) {
		this.index = index;
		this.isLargeOperand = isLargeOperand;
	}

	public ClientScriptCommand(int arg0) {
		this(arg0, false);
	}
}
