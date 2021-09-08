# language: en
Feature: Drop down menu

  Scenario: Open categories menu

  When user open onliner site
  And user hover over on avtobaraholka
  Then avtobaraholka drop down menu is opened with with categories
    | BMW | Honda | Минск |

