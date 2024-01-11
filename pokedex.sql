-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 11, 2024 at 02:00 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pokedex`
--
CREATE DATABASE IF NOT EXISTS `pokedex` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `pokedex`;

-- --------------------------------------------------------

--
-- Table structure for table `kemampuan`
--

CREATE TABLE `kemampuan` (
  `id` int(10) UNSIGNED NOT NULL,
  `nama` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `kemampuan`
--

INSERT INTO `kemampuan` (`id`, `nama`) VALUES
(1, 'stench'),
(2, 'drizzle'),
(3, 'speed-boost'),
(4, 'battle-armor'),
(5, 'sturdy'),
(6, 'damp'),
(7, 'limber'),
(8, 'sand-veil'),
(9, 'static'),
(10, 'volt-absorb'),
(11, 'water-absorb'),
(12, 'oblivious'),
(13, 'cloud-nine'),
(14, 'compound-eyes'),
(15, 'insomnia'),
(16, 'color-change'),
(17, 'immunity'),
(18, 'flash-fire'),
(19, 'shield-dust'),
(20, 'own-tempo'),
(21, 'suction-cups'),
(22, 'intimidate'),
(23, 'shadow-tag'),
(24, 'rough-skin'),
(25, 'wonder-guard'),
(26, 'levitate'),
(27, 'effect-spore'),
(28, 'synchronize'),
(29, 'clear-body'),
(30, 'natural-cure'),
(31, 'lightning-rod'),
(32, 'serene-grace'),
(33, 'swift-swim'),
(34, 'chlorophyll'),
(35, 'illuminate'),
(36, 'trace'),
(37, 'huge-power'),
(38, 'poison-point'),
(39, 'inner-focus'),
(40, 'magma-armor'),
(41, 'water-veil'),
(42, 'magnet-pull'),
(43, 'soundproof'),
(44, 'rain-dish'),
(45, 'sand-stream'),
(46, 'pressure'),
(47, 'thick-fat'),
(48, 'early-bird'),
(49, 'flame-body'),
(50, 'run-away'),
(51, 'keen-eye'),
(52, 'hyper-cutter'),
(53, 'pickup'),
(54, 'truant'),
(55, 'hustle'),
(56, 'cute-charm'),
(57, 'plus'),
(58, 'minus'),
(59, 'forecast'),
(60, 'sticky-hold'),
(61, 'shed-skin'),
(62, 'guts'),
(63, 'marvel-scale'),
(64, 'liquid-ooze'),
(65, 'overgrow'),
(66, 'blaze'),
(67, 'torrent'),
(68, 'swarm'),
(69, 'rock-head'),
(70, 'drought'),
(71, 'arena-trap'),
(72, 'vital-spirit'),
(73, 'white-smoke'),
(74, 'pure-power'),
(75, 'shell-armor'),
(76, 'air-lock'),
(77, 'tangled-feet'),
(78, 'motor-drive'),
(79, 'rivalry'),
(80, 'steadfast'),
(81, 'snow-cloak'),
(82, 'gluttony'),
(83, 'anger-point'),
(84, 'unburden'),
(85, 'heatproof'),
(86, 'simple'),
(87, 'dry-skin'),
(88, 'download'),
(89, 'iron-fist'),
(90, 'poison-heal'),
(91, 'adaptability'),
(92, 'skill-link'),
(93, 'hydration'),
(94, 'solar-power'),
(95, 'quick-feet'),
(96, 'normalize'),
(97, 'sniper'),
(98, 'magic-guard'),
(99, 'no-guard'),
(100, 'stall'),
(101, 'technician'),
(102, 'leaf-guard'),
(103, 'klutz'),
(104, 'mold-breaker'),
(105, 'super-luck'),
(106, 'aftermath'),
(107, 'anticipation'),
(108, 'forewarn'),
(109, 'unaware'),
(110, 'tinted-lens'),
(111, 'filter'),
(112, 'slow-start'),
(113, 'scrappy'),
(114, 'storm-drain'),
(115, 'ice-body'),
(116, 'solid-rock'),
(117, 'snow-warning'),
(118, 'honey-gather'),
(119, 'frisk'),
(120, 'reckless'),
(121, 'multitype'),
(122, 'flower-gift'),
(123, 'bad-dreams'),
(124, 'pickpocket'),
(125, 'sheer-force'),
(126, 'contrary'),
(127, 'unnerve'),
(128, 'defiant'),
(129, 'defeatist'),
(130, 'cursed-body'),
(131, 'healer'),
(132, 'friend-guard'),
(133, 'weak-armor'),
(134, 'heavy-metal'),
(135, 'light-metal'),
(136, 'multiscale'),
(137, 'toxic-boost'),
(138, 'flare-boost'),
(139, 'harvest'),
(140, 'telepathy'),
(141, 'moody'),
(142, 'overcoat'),
(143, 'poison-touch'),
(144, 'regenerator'),
(145, 'big-pecks'),
(146, 'sand-rush'),
(147, 'wonder-skin'),
(148, 'analytic'),
(149, 'illusion'),
(150, 'imposter'),
(151, 'infiltrator'),
(152, 'mummy'),
(153, 'moxie'),
(154, 'justified'),
(155, 'rattled'),
(156, 'magic-bounce'),
(157, 'sap-sipper'),
(158, 'prankster'),
(159, 'sand-force'),
(160, 'iron-barbs'),
(161, 'zen-mode'),
(162, 'victory-star'),
(163, 'turboblaze'),
(164, 'teravolt'),
(165, 'aroma-veil'),
(166, 'flower-veil'),
(167, 'cheek-pouch'),
(168, 'protean'),
(169, 'fur-coat'),
(170, 'magician'),
(171, 'bulletproof'),
(172, 'competitive'),
(173, 'strong-jaw'),
(174, 'refrigerate'),
(175, 'sweet-veil'),
(176, 'stance-change'),
(177, 'gale-wings'),
(178, 'mega-launcher'),
(179, 'grass-pelt'),
(180, 'symbiosis'),
(181, 'tough-claws'),
(182, 'pixilate'),
(183, 'gooey'),
(184, 'aerilate'),
(185, 'parental-bond'),
(186, 'dark-aura'),
(187, 'fairy-aura'),
(188, 'aura-break'),
(189, 'primordial-sea'),
(190, 'desolate-land'),
(191, 'delta-stream'),
(192, 'stamina'),
(193, 'wimp-out'),
(194, 'emergency-exit'),
(195, 'water-compaction'),
(196, 'merciless'),
(197, 'shields-down'),
(198, 'stakeout'),
(199, 'water-bubble'),
(200, 'steelworker'),
(201, 'berserk'),
(202, 'slush-rush'),
(203, 'long-reach'),
(204, 'liquid-voice'),
(205, 'triage'),
(206, 'galvanize'),
(207, 'surge-surfer'),
(208, 'schooling'),
(209, 'disguise'),
(210, 'battle-bond'),
(211, 'power-construct'),
(212, 'corrosion'),
(213, 'comatose'),
(214, 'queenly-majesty'),
(215, 'innards-out'),
(216, 'dancer'),
(217, 'battery'),
(218, 'fluffy'),
(219, 'dazzling'),
(220, 'soul-heart'),
(221, 'tangling-hair'),
(222, 'receiver'),
(223, 'power-of-alchemy'),
(224, 'beast-boost'),
(225, 'rks-system'),
(226, 'electric-surge'),
(227, 'psychic-surge'),
(228, 'misty-surge'),
(229, 'grassy-surge'),
(230, 'full-metal-body'),
(231, 'shadow-shield'),
(232, 'prism-armor'),
(233, 'neuroforce'),
(234, 'intrepid-sword'),
(235, 'dauntless-shield'),
(236, 'libero'),
(237, 'ball-fetch'),
(238, 'cotton-down'),
(239, 'propeller-tail'),
(240, 'mirror-armor'),
(241, 'gulp-missile'),
(242, 'stalwart'),
(243, 'steam-engine'),
(244, 'punk-rock'),
(245, 'sand-spit'),
(246, 'ice-scales'),
(247, 'ripen'),
(248, 'ice-face'),
(249, 'power-spot'),
(250, 'mimicry'),
(251, 'screen-cleaner'),
(252, 'steely-spirit'),
(253, 'perish-body'),
(254, 'wandering-spirit'),
(255, 'gorilla-tactics'),
(256, 'neutralizing-gas'),
(257, 'pastel-veil'),
(258, 'hunger-switch'),
(259, 'quick-draw'),
(260, 'unseen-fist'),
(261, 'curious-medicine'),
(262, 'transistor'),
(263, 'dragons-maw'),
(264, 'chilling-neigh'),
(265, 'grim-neigh'),
(266, 'as-one-glastrier'),
(267, 'as-one-spectrier'),
(268, 'lingering-aroma'),
(269, 'seed-sower'),
(270, 'thermal-exchange'),
(271, 'anger-shell'),
(272, 'purifying-salt'),
(273, 'well-baked-body'),
(274, 'wind-rider'),
(275, 'guard-dog'),
(276, 'rocky-payload'),
(277, 'wind-power'),
(278, 'zero-to-hero'),
(279, 'commander'),
(280, 'electromorphosis'),
(281, 'protosynthesis'),
(282, 'quark-drive'),
(283, 'good-as-gold'),
(284, 'vessel-of-ruin'),
(285, 'sword-of-ruin'),
(286, 'tablets-of-ruin'),
(287, 'beads-of-ruin'),
(288, 'orichalcum-pulse'),
(289, 'hadron-engine'),
(290, 'opportunist'),
(291, 'cud-chew'),
(292, 'sharpness'),
(293, 'supreme-overlord'),
(294, 'costar'),
(295, 'toxic-debris'),
(296, 'armor-tail'),
(297, 'earth-eater'),
(298, 'mycelium-might'),
(299, 'minds-eye'),
(300, 'supersweet-syrup'),
(301, 'hospitality'),
(302, 'toxic-chain'),
(303, 'embody-aspect'),
(304, 'tera-shift'),
(305, 'tera-shell'),
(306, 'teraform-zero'),
(307, 'poison-puppeteer'),
(308, 'mountaineer'),
(309, 'wave-rider'),
(310, 'skater'),
(311, 'thrust'),
(312, 'perception'),
(313, 'parry'),
(314, 'instinct'),
(315, 'dodge'),
(316, 'jagged-edge'),
(317, 'frostbite'),
(318, 'tenacity'),
(319, 'pride'),
(320, 'deep-sleep'),
(321, 'power-nap'),
(322, 'spirit'),
(323, 'warm-blanket'),
(324, 'gulp'),
(325, 'herbivore'),
(326, 'sandpit'),
(327, 'hot-blooded'),
(328, 'medic'),
(329, 'life-force'),
(330, 'lunchbox'),
(331, 'nurse'),
(332, 'melee'),
(333, 'sponge'),
(334, 'bodyguard'),
(335, 'hero'),
(336, 'last-bastion'),
(337, 'stealth'),
(338, 'vanguard'),
(339, 'nomad'),
(340, 'sequence'),
(341, 'grass-cloak'),
(342, 'celebrate'),
(343, 'lullaby'),
(344, 'calming'),
(345, 'daze'),
(346, 'frighten'),
(347, 'interference'),
(348, 'mood-maker'),
(349, 'confidence'),
(350, 'fortune'),
(351, 'bonanza'),
(352, 'explode'),
(353, 'omnipotent'),
(354, 'share'),
(355, 'black-hole'),
(356, 'shadow-dash'),
(357, 'sprint'),
(358, 'disgust'),
(359, 'high-rise'),
(360, 'climber'),
(361, 'flame-boost'),
(362, 'aqua-boost'),
(363, 'run-up'),
(364, 'conqueror'),
(365, 'shackle'),
(366, 'decoy'),
(367, 'shield');

-- --------------------------------------------------------

--
-- Table structure for table `kemampuan_pokemon`
--

CREATE TABLE `kemampuan_pokemon` (
  `id` int(10) UNSIGNED NOT NULL,
  `pokemon_id` int(10) UNSIGNED NOT NULL,
  `kemampuan_id` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `kemampuan_pokemon`
--

INSERT INTO `kemampuan_pokemon` (`id`, `pokemon_id`, `kemampuan_id`) VALUES
(4, 4, 65),
(5, 5, 65),
(6, 6, 66),
(7, 7, 66),
(8, 8, 66),
(9, 9, 67),
(10, 10, 67),
(11, 11, 67),
(12, 12, 19),
(13, 13, 61),
(19, 18, 14);

-- --------------------------------------------------------

--
-- Table structure for table `pokemon`
--

CREATE TABLE `pokemon` (
  `id` int(10) UNSIGNED NOT NULL,
  `pokedex_id` int(4) UNSIGNED ZEROFILL NOT NULL,
  `nama` varchar(20) NOT NULL,
  `tinggi` float UNSIGNED NOT NULL,
  `berat` float UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pokemon`
--

INSERT INTO `pokemon` (`id`, `pokedex_id`, `nama`, `tinggi`, `berat`) VALUES
(4, 0002, 'Ivysaur', 1, 13),
(5, 0003, 'Venusaur', 2, 100),
(6, 0004, 'Charmander', 0.6, 8.5),
(7, 0005, 'Charmeleon', 1.1, 19),
(8, 0006, 'Charizard', 1.7, 90.5),
(9, 0007, 'Squirtle', 0.5, 9),
(10, 0008, 'Wartortle', 1, 22.5),
(11, 0009, 'Blastoise', 1.6, 85.5),
(12, 0010, 'Caterpie', 0.3, 2.9),
(13, 0011, 'Metapod', 0.7, 9.9),
(18, 0012, 'Butterfree', 1.1, 32);

-- --------------------------------------------------------

--
-- Table structure for table `pokemon_tipe`
--

CREATE TABLE `pokemon_tipe` (
  `id` int(10) UNSIGNED NOT NULL,
  `pokemon_id` int(10) UNSIGNED NOT NULL,
  `tipe_id` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pokemon_tipe`
--

INSERT INTO `pokemon_tipe` (`id`, `pokemon_id`, `tipe_id`) VALUES
(7, 4, 12),
(8, 4, 4),
(9, 5, 12),
(10, 5, 4),
(11, 6, 10),
(12, 7, 10),
(13, 8, 10),
(14, 8, 3),
(15, 9, 11),
(16, 10, 11),
(17, 11, 11),
(18, 12, 7),
(19, 13, 7),
(28, 18, 7),
(29, 18, 3);

-- --------------------------------------------------------

--
-- Table structure for table `tipe`
--

CREATE TABLE `tipe` (
  `id` int(10) UNSIGNED NOT NULL,
  `nama` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tipe`
--

INSERT INTO `tipe` (`id`, `nama`) VALUES
(1, 'normal'),
(2, 'fighting'),
(3, 'flying'),
(4, 'poison'),
(5, 'ground'),
(6, 'rock'),
(7, 'bug'),
(8, 'ghost'),
(9, 'steel'),
(10, 'fire'),
(11, 'water'),
(12, 'grass'),
(13, 'electric'),
(14, 'psychic'),
(15, 'ice'),
(16, 'dragon'),
(17, 'dark'),
(18, 'fairy'),
(19, 'unknown'),
(20, 'shadow');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(10) UNSIGNED NOT NULL,
  `nama` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `nama`, `password`) VALUES
(1, 'admin', '$2a$10$eyJ0G733zvzNJj1Eax4U8.obSb1jl0AUnjdLqzUGUHyvtIAM1.bNq'),
(10, 'orang1', '$2a$10$tG4Hrxrt8yCygLmZhSu3BORDwoLTvYBJXvLRqgH9e9lxo1zC.vEmS'),
(11, 'orang2', '$2a$10$PW5WsqSYzAQL7X5xvfyt2OgwkwlmK0/e7R69JyvaSbzn2uxpVUkf6');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `kemampuan`
--
ALTER TABLE `kemampuan`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `kemampuan_pokemon`
--
ALTER TABLE `kemampuan_pokemon`
  ADD PRIMARY KEY (`id`),
  ADD KEY `pokemon_id` (`pokemon_id`),
  ADD KEY `kemampuan_id` (`kemampuan_id`);

--
-- Indexes for table `pokemon`
--
ALTER TABLE `pokemon`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `pokemon_tipe`
--
ALTER TABLE `pokemon_tipe`
  ADD PRIMARY KEY (`id`),
  ADD KEY `pokemon_id` (`pokemon_id`),
  ADD KEY `tipe_id` (`tipe_id`);

--
-- Indexes for table `tipe`
--
ALTER TABLE `tipe`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `nama` (`nama`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `kemampuan`
--
ALTER TABLE `kemampuan`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=368;

--
-- AUTO_INCREMENT for table `kemampuan_pokemon`
--
ALTER TABLE `kemampuan_pokemon`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT for table `pokemon`
--
ALTER TABLE `pokemon`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT for table `pokemon_tipe`
--
ALTER TABLE `pokemon_tipe`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=30;

--
-- AUTO_INCREMENT for table `tipe`
--
ALTER TABLE `tipe`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `kemampuan_pokemon`
--
ALTER TABLE `kemampuan_pokemon`
  ADD CONSTRAINT `kp-kemampuan` FOREIGN KEY (`kemampuan_id`) REFERENCES `kemampuan` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `kp-pokemon` FOREIGN KEY (`pokemon_id`) REFERENCES `pokemon` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `pokemon_tipe`
--
ALTER TABLE `pokemon_tipe`
  ADD CONSTRAINT `pt-pokemon` FOREIGN KEY (`pokemon_id`) REFERENCES `pokemon` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `pt-tipe` FOREIGN KEY (`tipe_id`) REFERENCES `tipe` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
