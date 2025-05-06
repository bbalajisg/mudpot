# Editor Settings



{% tabs %}
{% tab title="$HOME/.config/wezterm/wezterm.lua" %}
```
local wezterm = require 'wezterm'

return {
  -- Appearance
  color_scheme = 'Gruvbox Dark',
  font = wezterm.font_with_fallback {
    { family = "JetBrainsMono Nerd Font", weight = "Regular" },
    { family = "FiraCode Nerd Font", weight = "Regular" },
    { family = "Hack Nerd Font", weight = "Regular" },
  },
  font_size = 18.0,
  line_height = 1.2,
  cell_width = 1.0,
  adjust_window_size_when_changing_font_size = false,

  -- color_scheme = 'Catppuccin Mocha', -- Or 'Gruvbox Dark', 'Tokyo Night', 'Dracula'
  color_scheme = 'Gruvbox Dark',
  window_background_opacity = 0.92,
  text_background_opacity = 1.0,
  use_fancy_tab_bar = true,
  hide_tab_bar_if_only_one_tab = true,
  tab_bar_at_bottom = false,
  window_decorations = "RESIZE|TITLE", -- Minimal, no title bar
  enable_tab_bar = true,

  -- Performance
  front_end = 'WebGpu', -- If issues, fallback to "OpenGL"
  max_fps = 144, -- depends on your monitor
  enable_scroll_bar = false,
  scrollback_lines = 10000,

  -- Terminal behavior
  enable_wayland = false,
  scrollback_lines = 10000,
  check_for_updates = false,
  automatically_reload_config = true,

  -- Clipboard
  enable_kitty_keyboard = true,
  enable_csi_u_key_encoding = true,

  -- Keybindings
  keys = {
    -- Pane Splits
    { key = "|", mods = "ALT|SHIFT", action = wezterm.action.SplitHorizontal{domain="CurrentPaneDomain"} },
    { key = "-", mods = "ALT", action = wezterm.action.SplitVertical{domain="CurrentPaneDomain"} },

    -- Pane Navigation
    { key = "h", mods = "ALT", action = wezterm.action.ActivatePaneDirection("Left") },
    { key = "l", mods = "ALT", action = wezterm.action.ActivatePaneDirection("Right") },
    { key = "k", mods = "ALT", action = wezterm.action.ActivatePaneDirection("Up") },
    { key = "j", mods = "ALT", action = wezterm.action.ActivatePaneDirection("Down") },

    -- Copy-Paste
    { key = "c", mods = "CMD", action = wezterm.action.CopyTo("Clipboard") },
    { key = "v", mods = "CMD", action = wezterm.action.PasteFrom("Clipboard") },
  },

 -- Other nice-to-haves
 adjust_window_size_when_changing_font_size = false,
 window_padding = {
    left = 4,
    right = 4,
    top = 2,
    bottom = 2,
  },

  -- Misc
  audible_bell = "Disabled",
  check_for_updates = false,
  automatically_reload_config = true,

}

```
{% endtab %}

{% tab title="$HOME/.config/zed/settings.json" %}
```
// Zed settings
//
// For information on how to configure Zed, see the Zed
// documentation: https://zed.dev/docs/configuring-zed
//
// To see all of Zed's default settings without changing your
// custom settings, run `zed: open default settings` from the
// command palette (cmd-shift-p / ctrl-shift-p)
// {
//   "features": {
//     "edit_prediction_provider": "zed"
//   },
//   "autoSave": true,
//   "autoSaveMode": "onWindowChange",
//   "ui_font_size": 16,
//   "buffer_font_size": 16,
//   "theme": {
//     "mode": "system",
//     "light": "One Light",
//     "dark": "One Dark"
//   }
// }

{
  // UI preferences
  "ui_font_size": 16,
  "buffer_font_size": 16,
  "theme": "One Light",

  // Editor behavior
  "autosave": "on_focus_change", // Automatically save when switching files or windows[4][5]
  "format_on_save": "on", // Format code on save[4]
  "formatter": "auto", // Use best available formatter (Prettier, language server, etc.)[4]
  "enable_language_server": true,
  "linked_edits": true, // Linked edits for tags, etc.[4]
  "soft_wrap": "editor_width", // Soft-wrap lines at editor width[4]
  "preferred_line_length": 100, // Show wrap guide at 100 chars[4]
  "show_call_status_icon": true,

  // Diagnostics
  "diagnostics": {
    "include_warnings": true,
    "inline": {
      "enabled": true, // Show inline diagnostics[1]
      "update_debounce_ms": 150,
      "padding": 4,
      "min_column": 80,
      "max_severity": "warning"
    },
    "update_with_cursor": false,
    "primary_only": false,
    "use_rendered": false
  },

  // File associations
  "file_types": {
    "JSONC": ["**/.zed/**/*.json", "**/zed/**/*.json", "**/Zed/**/*.json", "**/.vscode/**/*.json"],
    "Shell Script": [".env.*"]
  },

  // Language-specific settings
  "languages": {
    "Python": {
      "tab_size": 4,
      "formatter": "language_server",
      "format_on_save": "on"
    },
    "JavaScript": {
      "tab_size": 2,
      "formatter": {
        "external": {
          "command": "prettier",
          "arguments": ["--stdin-filepath", "{buffer_path}"]
        }
      },
      "code_actions_on_format": {
        "source.fixAll.eslint": true
      },
      "format_on_save": "on"
    },
    "Rust": {
      "formatter": "language_server",
      "format_on_save": "on"
    }
    // Add more language overrides as needed[2]
  },

  // Telemetry (optional, for privacy)
  "telemetry": {
    "diagnostics": false,
    "metrics": false
  }
}

```
{% endtab %}
{% endtabs %}
