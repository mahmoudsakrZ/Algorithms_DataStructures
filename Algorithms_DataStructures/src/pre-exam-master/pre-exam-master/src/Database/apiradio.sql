-- phpMyAdmin SQL Dump
-- version 4.6.0
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Dec 10, 2017 at 03:21 PM
-- Server version: 5.5.54-0ubuntu0.14.04.1
-- PHP Version: 5.5.9-1ubuntu4.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `apiradio`
--

-- --------------------------------------------------------

--
-- Table structure for table `api`
--

CREATE TABLE `api` (
  `id` int(11) NOT NULL,
  `brand` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `api_id` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `radio_id` int(5) DEFAULT NULL,
  `radio_slug` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `modification_date` datetime DEFAULT NULL,
  `creation_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `artists`
--

CREATE TABLE `artists` (
  `id` int(11) NOT NULL,
  `name` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `url_image` varchar(256) COLLATE utf8_unicode_ci DEFAULT NULL,
  `provider` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `external_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `cities`
--

CREATE TABLE `cities` (
  `id` int(11) NOT NULL,
  `name` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `latitude` double DEFAULT NULL,
  `longitude` double DEFAULT NULL,
  `country_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `continents`
--

CREATE TABLE `continents` (
  `id` int(11) NOT NULL,
  `code` varchar(2) COLLATE utf8_unicode_ci NOT NULL,
  `name` varchar(30) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `countries`
--

CREATE TABLE `countries` (
  `id` int(11) NOT NULL,
  `code` varchar(2) COLLATE utf8_unicode_ci DEFAULT NULL,
  `name` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `continent_id` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `countries_podcasts`
--

CREATE TABLE `countries_podcasts` (
  `country_id` int(6) NOT NULL,
  `podcast_id` int(6) NOT NULL,
  `audience` int(11) DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `countries_radios`
--

CREATE TABLE `countries_radios` (
  `country_id` int(6) NOT NULL,
  `radio_id` int(6) NOT NULL,
  `audience` int(11) DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `devices`
--

CREATE TABLE `devices` (
  `mac_address` bigint(20) UNSIGNED NOT NULL,
  `preset` int(2) NOT NULL,
  `radio_slug` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `modification_date` datetime DEFAULT NULL,
  `creation_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `is_preset` tinyint(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `epgs`
--

CREATE TABLE `epgs` (
  `days` varchar(13) COLLATE utf8_unicode_ci NOT NULL,
  `begin_date` time NOT NULL,
  `end_date` time NOT NULL,
  `name` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  `description` varchar(500) COLLATE utf8_unicode_ci DEFAULT NULL,
  `id` int(7) NOT NULL,
  `radio_id` int(7) NOT NULL,
  `podcast_id` int(7) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `genres`
--

CREATE TABLE `genres` (
  `id` int(6) NOT NULL,
  `name` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `slug` varchar(255) COLLATE utf8_unicode_ci NOT NULL DEFAULT 'slug',
  `type` varchar(32) COLLATE utf8_unicode_ci NOT NULL DEFAULT 'unused',
  `parent_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `genres_podcasts`
--

CREATE TABLE `genres_podcasts` (
  `genre_id` int(6) NOT NULL,
  `podcast_id` int(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `genres_radios`
--

CREATE TABLE `genres_radios` (
  `genre_id` int(6) NOT NULL,
  `radio_id` int(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `items_lists`
--

CREATE TABLE `items_lists` (
  `id` int(11) NOT NULL,
  `userlist_id` int(11) NOT NULL,
  `permalink` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `seq` smallint(6) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `localisations_radios`
--

CREATE TABLE `localisations_radios` (
  `id` int(11) NOT NULL,
  `frequency` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `radio_id` int(11) NOT NULL,
  `continent_id` int(11) DEFAULT NULL,
  `country_id` int(11) DEFAULT NULL,
  `city_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `playlists`
--

CREATE TABLE `playlists` (
  `id` int(6) NOT NULL,
  `type` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `url` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `last_update` datetime DEFAULT NULL,
  `hash_md5` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `history` bigint(11) NOT NULL DEFAULT '0',
  `nb_days_ko` int(11) NOT NULL DEFAULT '0',
  `radio_id` int(6) DEFAULT NULL,
  `show_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `podcasts`
--

CREATE TABLE `podcasts` (
  `id` int(6) NOT NULL,
  `name` varchar(500) COLLATE utf8_unicode_ci DEFAULT NULL,
  `slug` varchar(500) COLLATE utf8_unicode_ci DEFAULT NULL,
  `baseline` varchar(500) COLLATE utf8_unicode_ci DEFAULT NULL,
  `description` varchar(2048) COLLATE utf8_unicode_ci DEFAULT NULL,
  `source_logo` varchar(500) COLLATE utf8_unicode_ci DEFAULT NULL,
  `source_ext_logo` varchar(6) COLLATE utf8_unicode_ci DEFAULT NULL,
  `url_web` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `url_twitter` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `url_facebook` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `url_syndication` varchar(500) COLLATE utf8_unicode_ci NOT NULL,
  `keywords` varchar(500) COLLATE utf8_unicode_ci DEFAULT NULL,
  `periodicity` varchar(1) COLLATE utf8_unicode_ci DEFAULT NULL,
  `audience` int(11) DEFAULT '0',
  `history` bigint(11) NOT NULL DEFAULT '0',
  `genre_source` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `nb_days_ko` int(11) NOT NULL DEFAULT '0',
  `radio_id` int(6) DEFAULT NULL,
  `creation_date` datetime NOT NULL,
  `last_update` datetime DEFAULT NULL,
  `hash_md5` varchar(40) COLLATE utf8_unicode_ci DEFAULT NULL,
  `modification_date` datetime DEFAULT NULL,
  `is_fastair` int(11) NOT NULL DEFAULT '0',
  `fastair_status` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `last_fastair_status` datetime DEFAULT NULL,
  `update_auto` tinyint(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `radios`
--

CREATE TABLE `radios` (
  `id` int(5) NOT NULL,
  `name` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `ps_name` varchar(8) COLLATE utf8_unicode_ci DEFAULT NULL,
  `pi_code` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `sid` varchar(4) COLLATE utf8_unicode_ci DEFAULT NULL,
  `service_label` varchar(8) COLLATE utf8_unicode_ci DEFAULT NULL,
  `slug` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `baseline` varchar(500) COLLATE utf8_unicode_ci DEFAULT NULL,
  `description` varchar(500) COLLATE utf8_unicode_ci DEFAULT NULL,
  `language` varchar(30) COLLATE utf8_unicode_ci DEFAULT NULL,
  `source_logo` varchar(512) COLLATE utf8_unicode_ci DEFAULT NULL,
  `source_ext_logo` varchar(512) COLLATE utf8_unicode_ci DEFAULT NULL,
  `url_web` varchar(250) COLLATE utf8_unicode_ci DEFAULT NULL,
  `url_twitter` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `url_facebook` varchar(250) COLLATE utf8_unicode_ci DEFAULT NULL,
  `keywords` varchar(500) COLLATE utf8_unicode_ci DEFAULT NULL,
  `audience` int(11) DEFAULT '0',
  `history` bigint(11) NOT NULL DEFAULT '0',
  `genre_source` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `creation_date` datetime NOT NULL,
  `modification_date` datetime DEFAULT NULL,
  `enabled` tinyint(1) DEFAULT NULL,
  `status` tinyint(2) DEFAULT '0',
  `catalog` int(10) DEFAULT '3',
  `meta` tinyint(2) DEFAULT '0',
  `external_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `radios_contact`
--

CREATE TABLE `radios_contact` (
  `id` int(11) NOT NULL,
  `radio_id` int(5) DEFAULT NULL,
  `email` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `modification_date` datetime DEFAULT NULL,
  `creation_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `radios_solr`
--

CREATE TABLE `radios_solr` (
  `radioId` tinyint(4) NOT NULL,
  `description` tinyint(4) NOT NULL,
  `name` tinyint(4) NOT NULL,
  `source_logo` tinyint(4) NOT NULL,
  `source_ext_logo` tinyint(4) NOT NULL,
  `keywords` tinyint(4) NOT NULL,
  `genresName_radio` tinyint(4) NOT NULL,
  `genresSlug_radio` tinyint(4) NOT NULL,
  `audience` tinyint(4) NOT NULL,
  `radioUrlWeb` tinyint(4) NOT NULL,
  `radioUrlTwitter` tinyint(4) NOT NULL,
  `radioUrlFacebook` tinyint(4) NOT NULL,
  `radioCreationDate` tinyint(4) NOT NULL,
  `radioModificationDate` tinyint(4) NOT NULL,
  `radioHistory` tinyint(4) NOT NULL,
  `radioBaseline` tinyint(4) NOT NULL,
  `radioLanguage` tinyint(4) NOT NULL,
  `radioCsaName` tinyint(4) NOT NULL,
  `radioSlug` tinyint(4) NOT NULL,
  `radioCodePi` tinyint(4) NOT NULL,
  `enabled` tinyint(4) NOT NULL,
  `name_completion` tinyint(4) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `radios_songs`
--

CREATE TABLE `radios_songs` (
  `id` int(11) NOT NULL,
  `playing_date` datetime NOT NULL,
  `song_id` int(11) NOT NULL,
  `radio_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `shows`
--

CREATE TABLE `shows` (
  `id` int(8) NOT NULL,
  `name` varchar(500) COLLATE utf8_unicode_ci DEFAULT NULL,
  `slug` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `guid` varchar(500) COLLATE utf8_unicode_ci DEFAULT NULL,
  `description` varchar(1024) COLLATE utf8_unicode_ci DEFAULT NULL,
  `isLive` tinyint(1) DEFAULT NULL,
  `author` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `pub_date` datetime DEFAULT NULL,
  `keywords` varchar(500) COLLATE utf8_unicode_ci DEFAULT NULL,
  `duration` varchar(15) COLLATE utf8_unicode_ci DEFAULT NULL,
  `audience` int(11) DEFAULT '0',
  `history` bigint(11) NOT NULL DEFAULT '0',
  `podcast_id` int(6) NOT NULL,
  `creation_date` datetime DEFAULT NULL,
  `url_fastair_report` varchar(500) COLLATE utf8_unicode_ci DEFAULT NULL,
  `lat` double DEFAULT NULL,
  `lon` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `similar`
--

CREATE TABLE `similar` (
  `id` int(11) NOT NULL,
  `permalink` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `type` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `slug` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `value` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `similar_tmp`
--

CREATE TABLE `similar_tmp` (
  `id` int(11) NOT NULL,
  `permalink` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `type` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `slug` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `value` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `songs`
--

CREATE TABLE `songs` (
  `id` int(11) NOT NULL,
  `name` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `url_image` varchar(256) COLLATE utf8_unicode_ci DEFAULT NULL,
  `provider` varchar(10) COLLATE utf8_unicode_ci DEFAULT 'UNKNOWN',
  `external_id` int(11) DEFAULT NULL,
  `artist_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `streams`
--

CREATE TABLE `streams` (
  `id` int(10) NOT NULL,
  `transport` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `url` varchar(500) COLLATE utf8_unicode_ci NOT NULL,
  `bitrate` int(7) DEFAULT NULL,
  `container` varchar(12) COLLATE utf8_unicode_ci DEFAULT NULL,
  `audiocodec` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `audiochannels` int(2) DEFAULT NULL,
  `error` varchar(500) COLLATE utf8_unicode_ci DEFAULT NULL,
  `history` bigint(11) NOT NULL DEFAULT '0',
  `nb_days_ko` int(11) NOT NULL DEFAULT '0',
  `radio_id` int(6) DEFAULT NULL,
  `show_id` int(8) DEFAULT NULL,
  `flag` tinyint(4) DEFAULT NULL,
  `last_update` datetime DEFAULT NULL,
  `playlist_id` int(6) DEFAULT NULL,
  `last_check` datetime DEFAULT NULL,
  `enable_check` tinyint(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `suggestions`
--

CREATE TABLE `suggestions` (
  `id` int(11) NOT NULL,
  `action` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `entity` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `fields` text COLLATE utf8_unicode_ci,
  `comment` text COLLATE utf8_unicode_ci,
  `requester` varchar(150) COLLATE utf8_unicode_ci DEFAULT NULL,
  `is_approved` varchar(15) COLLATE utf8_unicode_ci DEFAULT NULL,
  `readable_comment` text COLLATE utf8_unicode_ci,
  `locale` varchar(5) COLLATE utf8_unicode_ci DEFAULT 'en',
  `creation_date` datetime DEFAULT NULL,
  `moderation_date` datetime DEFAULT NULL,
  `delete_date` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `api`
--
ALTER TABLE `api`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `radio_slug_UNIQUE` (`radio_slug`),
  ADD KEY `api_id` (`api_id`),
  ADD KEY `fk_api_radios1_idx` (`radio_id`);

--
-- Indexes for table `artists`
--
ALTER TABLE `artists`
  ADD PRIMARY KEY (`id`),
  ADD KEY `INDEX_NAME` (`name`);

--
-- Indexes for table `cities`
--
ALTER TABLE `cities`
  ADD PRIMARY KEY (`id`),
  ADD KEY `country_id` (`country_id`);

--
-- Indexes for table `continents`
--
ALTER TABLE `continents`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `countries`
--
ALTER TABLE `countries`
  ADD PRIMARY KEY (`id`),
  ADD KEY `continent_id` (`continent_id`);

--
-- Indexes for table `countries_podcasts`
--
ALTER TABLE `countries_podcasts`
  ADD PRIMARY KEY (`country_id`,`podcast_id`),
  ADD KEY `countries_podcasts_ibfk_podcasts` (`podcast_id`);

--
-- Indexes for table `countries_radios`
--
ALTER TABLE `countries_radios`
  ADD PRIMARY KEY (`country_id`,`radio_id`),
  ADD KEY `countries_radios_ibfk_radios` (`radio_id`);

--
-- Indexes for table `devices`
--
ALTER TABLE `devices`
  ADD PRIMARY KEY (`mac_address`,`preset`,`is_preset`),
  ADD KEY `mac_address` (`mac_address`),
  ADD KEY `fk_devices_radios_idx` (`radio_slug`);

--
-- Indexes for table `epgs`
--
ALTER TABLE `epgs`
  ADD PRIMARY KEY (`id`),
  ADD KEY `podcast_id` (`podcast_id`),
  ADD KEY `radio_id` (`radio_id`);

--
-- Indexes for table `genres`
--
ALTER TABLE `genres`
  ADD PRIMARY KEY (`id`),
  ADD KEY `primary_id` (`parent_id`),
  ADD KEY `parent_id` (`parent_id`);

--
-- Indexes for table `genres_podcasts`
--
ALTER TABLE `genres_podcasts`
  ADD KEY `podcast_id` (`podcast_id`),
  ADD KEY `genre_id` (`genre_id`);

--
-- Indexes for table `genres_radios`
--
ALTER TABLE `genres_radios`
  ADD KEY `radio_id` (`radio_id`),
  ADD KEY `genre_id` (`genre_id`);

--
-- Indexes for table `items_lists`
--
ALTER TABLE `items_lists`
  ADD PRIMARY KEY (`id`),
  ADD KEY `userlist_id` (`userlist_id`);

--
-- Indexes for table `localisations_radios`
--
ALTER TABLE `localisations_radios`
  ADD PRIMARY KEY (`id`),
  ADD KEY `radio_id` (`radio_id`,`continent_id`,`country_id`,`city_id`),
  ADD KEY `single_radio_id` (`radio_id`),
  ADD KEY `continent_country` (`continent_id`,`country_id`),
  ADD KEY `localisation_radio_ibfk_3` (`country_id`),
  ADD KEY `localisation_radio_ibfk_4` (`city_id`);

--
-- Indexes for table `playlists`
--
ALTER TABLE `playlists`
  ADD PRIMARY KEY (`id`),
  ADD KEY `radio_id` (`radio_id`),
  ADD KEY `show_id` (`show_id`);

--
-- Indexes for table `podcasts`
--
ALTER TABLE `podcasts`
  ADD PRIMARY KEY (`id`),
  ADD KEY `radio_id` (`radio_id`),
  ADD KEY `slug` (`slug`(255));

--
-- Indexes for table `radios`
--
ALTER TABLE `radios`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `slug` (`slug`),
  ADD KEY `sid_service_label` (`sid`,`service_label`);

--
-- Indexes for table `radios_contact`
--
ALTER TABLE `radios_contact`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `radio_id_UNIQUE` (`radio_id`),
  ADD KEY `fk_radio_owner_radios1_idx` (`radio_id`);

--
-- Indexes for table `radios_songs`
--
ALTER TABLE `radios_songs`
  ADD PRIMARY KEY (`id`),
  ADD KEY `song_id` (`song_id`,`radio_id`),
  ADD KEY `radio_id` (`radio_id`),
  ADD KEY `playing_date` (`playing_date`);

--
-- Indexes for table `shows`
--
ALTER TABLE `shows`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `slug_2` (`slug`),
  ADD KEY `podcast_id` (`podcast_id`),
  ADD KEY `slug` (`slug`),
  ADD KEY `creation_date` (`creation_date`);

--
-- Indexes for table `similar`
--
ALTER TABLE `similar`
  ADD PRIMARY KEY (`id`),
  ADD KEY `permalink_type` (`permalink`,`type`);

--
-- Indexes for table `similar_tmp`
--
ALTER TABLE `similar_tmp`
  ADD PRIMARY KEY (`id`),
  ADD KEY `permalink_type` (`permalink`,`type`);

--
-- Indexes for table `songs`
--
ALTER TABLE `songs`
  ADD PRIMARY KEY (`id`),
  ADD KEY `artist_id` (`artist_id`);

--
-- Indexes for table `streams`
--
ALTER TABLE `streams`
  ADD PRIMARY KEY (`id`),
  ADD KEY `radio_id` (`radio_id`),
  ADD KEY `playlist_id` (`playlist_id`),
  ADD KEY `show_id` (`show_id`);

--
-- Indexes for table `suggestions`
--
ALTER TABLE `suggestions`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `api`
--
ALTER TABLE `api`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10652;
--
-- AUTO_INCREMENT for table `artists`
--
ALTER TABLE `artists`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=147159;
--
-- AUTO_INCREMENT for table `cities`
--
ALTER TABLE `cities`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1521;
--
-- AUTO_INCREMENT for table `continents`
--
ALTER TABLE `continents`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT for table `countries`
--
ALTER TABLE `countries`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=259;
--
-- AUTO_INCREMENT for table `epgs`
--
ALTER TABLE `epgs`
  MODIFY `id` int(7) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9428;
--
-- AUTO_INCREMENT for table `genres`
--
ALTER TABLE `genres`
  MODIFY `id` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=70;
--
-- AUTO_INCREMENT for table `items_lists`
--
ALTER TABLE `items_lists`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17943;
--
-- AUTO_INCREMENT for table `localisations_radios`
--
ALTER TABLE `localisations_radios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=36998;
--
-- AUTO_INCREMENT for table `playlists`
--
ALTER TABLE `playlists`
  MODIFY `id` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14552;
--
-- AUTO_INCREMENT for table `podcasts`
--
ALTER TABLE `podcasts`
  MODIFY `id` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=110806;
--
-- AUTO_INCREMENT for table `radios`
--
ALTER TABLE `radios`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=34697;
--
-- AUTO_INCREMENT for table `radios_contact`
--
ALTER TABLE `radios_contact`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6586;
--
-- AUTO_INCREMENT for table `radios_songs`
--
ALTER TABLE `radios_songs`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=122850761;
--
-- AUTO_INCREMENT for table `shows`
--
ALTER TABLE `shows`
  MODIFY `id` int(8) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5186062;
--
-- AUTO_INCREMENT for table `songs`
--
ALTER TABLE `songs`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=600263;
--
-- AUTO_INCREMENT for table `streams`
--
ALTER TABLE `streams`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4880508;
--
-- AUTO_INCREMENT for table `suggestions`
--
ALTER TABLE `suggestions`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=924;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `api`
--
ALTER TABLE `api`
  ADD CONSTRAINT `api_ibfk_1` FOREIGN KEY (`radio_id`) REFERENCES `radios` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `cities`
--
ALTER TABLE `cities`
  ADD CONSTRAINT `cities_ibfk_1` FOREIGN KEY (`country_id`) REFERENCES `countries` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `countries`
--
ALTER TABLE `countries`
  ADD CONSTRAINT `countries_ibfk_1` FOREIGN KEY (`continent_id`) REFERENCES `continents` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `countries_podcasts`
--
ALTER TABLE `countries_podcasts`
  ADD CONSTRAINT `countries_podcasts_ibfk_countries` FOREIGN KEY (`country_id`) REFERENCES `countries` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `countries_podcasts_ibfk_podcasts` FOREIGN KEY (`podcast_id`) REFERENCES `podcasts` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `countries_radios`
--
ALTER TABLE `countries_radios`
  ADD CONSTRAINT `countries_radios_ibfk_countries` FOREIGN KEY (`country_id`) REFERENCES `countries` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `countries_radios_ibfk_radios` FOREIGN KEY (`radio_id`) REFERENCES `radios` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `devices`
--
ALTER TABLE `devices`
  ADD CONSTRAINT `cst_fk_radio_slug_1` FOREIGN KEY (`radio_slug`) REFERENCES `radios` (`slug`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `genres`
--
ALTER TABLE `genres`
  ADD CONSTRAINT `genres_ibfk_1` FOREIGN KEY (`parent_id`) REFERENCES `genres` (`id`) ON DELETE SET NULL ON UPDATE CASCADE;

--
-- Constraints for table `genres_podcasts`
--
ALTER TABLE `genres_podcasts`
  ADD CONSTRAINT `genres_podcasts_ibfk_1` FOREIGN KEY (`podcast_id`) REFERENCES `podcasts` (`id`) ON DELETE CASCADE ON UPDATE NO ACTION;

--
-- Constraints for table `localisations_radios`
--
ALTER TABLE `localisations_radios`
  ADD CONSTRAINT `localisations_radios_ibfk_1` FOREIGN KEY (`radio_id`) REFERENCES `radios` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `localisations_radios_ibfk_2` FOREIGN KEY (`continent_id`) REFERENCES `continents` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `localisations_radios_ibfk_3` FOREIGN KEY (`country_id`) REFERENCES `countries` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `localisations_radios_ibfk_4` FOREIGN KEY (`city_id`) REFERENCES `cities` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `playlists`
--
ALTER TABLE `playlists`
  ADD CONSTRAINT `playlists_ibfk_1` FOREIGN KEY (`radio_id`) REFERENCES `radios` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `playlists_ibfk_2` FOREIGN KEY (`show_id`) REFERENCES `shows` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `podcasts`
--
ALTER TABLE `podcasts`
  ADD CONSTRAINT `podcasts_ibfk_2` FOREIGN KEY (`radio_id`) REFERENCES `radios` (`id`) ON DELETE SET NULL;

--
-- Constraints for table `radios_contact`
--
ALTER TABLE `radios_contact`
  ADD CONSTRAINT `radio_contact_ibfk_1` FOREIGN KEY (`radio_id`) REFERENCES `radios` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `radios_songs`
--
ALTER TABLE `radios_songs`
  ADD CONSTRAINT `radios_songs_ibfk_1` FOREIGN KEY (`song_id`) REFERENCES `songs` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `radios_songs_ibfk_2` FOREIGN KEY (`radio_id`) REFERENCES `radios` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `shows`
--
ALTER TABLE `shows`
  ADD CONSTRAINT `shows_ibfk_2` FOREIGN KEY (`podcast_id`) REFERENCES `podcasts` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `songs`
--
ALTER TABLE `songs`
  ADD CONSTRAINT `songs_ibfk_1` FOREIGN KEY (`artist_id`) REFERENCES `artists` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `streams`
--
ALTER TABLE `streams`
  ADD CONSTRAINT `streams_ibfk_3` FOREIGN KEY (`radio_id`) REFERENCES `radios` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `streams_ibfk_5` FOREIGN KEY (`playlist_id`) REFERENCES `playlists` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `streams_ibfk_6` FOREIGN KEY (`show_id`) REFERENCES `shows` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
